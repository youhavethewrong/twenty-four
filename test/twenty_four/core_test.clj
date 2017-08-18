(ns twenty-four.core-test
  (:require [clojure.test :refer :all]
            [twenty-four.core :refer :all]))

(deftest colors
  (testing "Set the foreground color."
    (println (str "Testing " (fg "soft blue" 124 185 232) " foreground."))
    (is (= "\033[38;2;124;185;232msoft blue\033[m"
           (fg "soft blue" 124 185 232))))
  (testing "Set the background color."
    (println (str "Testing " (bg "soft yellow" 232 225 124) " background."))
    (is (= "\033[48;2;232;225;124msoft yellow\033[m"
           (bg "soft yellow" 232 225 124))))
  (testing "Set both foreground and background."
    (println (str "Testing " (bg (fg "ivory and soft red" 255 255 240) 232 124 131) "."))
    (is (= "\033[48;2;232;124;131m\033[38;2;255;255;240mivory and soft red\033[m"
           (bg (fg "ivory and soft red" 255 255 240) 232 124 131)))))
