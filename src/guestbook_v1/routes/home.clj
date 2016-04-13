(ns guestbook_v1.routes.home
  (:require [compojure.core :refer :all]
            [guestbook_v1.views.layout :as layout]))

(defn home []
  (layout/common [:h1 "Hello World!"]))

(defroutes home-routes
  (GET "/" [] (home)))
