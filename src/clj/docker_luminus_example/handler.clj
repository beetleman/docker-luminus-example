(ns docker-luminus-example.handler
  (:require [compojure.core :refer [routes wrap-routes]]
            [docker-luminus-example.routes.services :refer [service-routes]]
            [compojure.route :as route]
            [docker-luminus-example.env :refer [defaults]]
            [mount.core :as mount]
            [docker-luminus-example.middleware :as middleware]))

(mount/defstate init-app
                :start ((or (:init defaults) identity))
                :stop  ((or (:stop defaults) identity)))

(def app-routes
  (routes
    #'service-routes
    (route/not-found
      "page not found")))


(defn app [] (middleware/wrap-base #'app-routes))
