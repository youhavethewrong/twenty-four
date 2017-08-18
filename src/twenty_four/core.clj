(ns twenty-four.core
  (:require [clojure.string :as str]))

(def csi "\033[")
(def clear (str csi "m"))

(defn- strip-clear
  [s]
  (str/replace s clear ""))

(defn fg
  [s & rgb]
  (str csi "38;2;" (apply str (interpose ";" rgb)) "m" (strip-clear s) clear))

(defn bg
  [s & rgb]
  (str csi "48;2;" (apply str (interpose ";" rgb)) "m" (strip-clear s) clear))
