(ns org.adrianwalker.clojure.Main
  (:require [org.adrianwalker.clojure.HelloWorld :as hw])
  (:require [org.adrianwalker.clojure.FizzBuzz :as fb])
  (:gen-class))

(defn -main
  [& args]
  (hw/-main)
  (fb/-main))