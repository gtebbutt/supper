(ns supper.logging
  (:require ["loglevel" :as loglevel]))

(def logger loglevel)

(defn trace
  [& msg]
  (.trace logger (apply str msg)))

(defn debug
  [& msg]
  (.debug logger (apply str msg)))

(defn info
  [& msg]
  (.info logger (apply str msg)))

(defn warn
  [& msg]
  (.warn logger (apply str msg)))

(defn error
  [& msg]
  (.error logger (apply str msg)))

(defn set-level!
  [level]
  (.setLevel logger level))
