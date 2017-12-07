(ns docker-luminus-example.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[docker-luminus-example started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[docker-luminus-example has shut down successfully]=-"))
   :middleware identity})
