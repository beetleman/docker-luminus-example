(ns docker-luminus-example.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [docker-luminus-example.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[docker-luminus-example started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[docker-luminus-example has shut down successfully]=-"))
   :middleware wrap-dev})
