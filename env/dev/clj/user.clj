(ns user
  (:require [luminus-migrations.core :as migrations]
            [docker-luminus-example.config :refer [env]]
            [mount.core :as mount]
            docker-luminus-example.core))

(defn start []
  (mount/start-without #'docker-luminus-example.core/repl-server))

(defn stop []
  (mount/stop-except #'docker-luminus-example.core/repl-server))

(defn restart []
  (stop)
  (start))

(defn migrate []
  (migrations/migrate ["migrate"] (select-keys env [:database-url])))

(defn rollback []
  (migrations/migrate ["rollback"] (select-keys env [:database-url])))


