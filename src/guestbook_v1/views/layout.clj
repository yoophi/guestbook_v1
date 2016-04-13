(ns guestbook_v1.views.layout
  (:require [hiccup.page :refer [html5 include-css]]))

(defn common [& body]
  (html5
    [:head
     [:title "Welcome to guestbook_v1"]
     (include-css "/css/screen.css")]
    [:body body]))
