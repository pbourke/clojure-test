(use 'clojure.string)

(defn addtwo [x]
  (+ 2 x))

(println (addtwo 11))

(println (map addtwo [1 2 3 4 5]))

(defn factorial [n]
  (loop [i n, res 1]
    (if (= 0 i)
      res
      (recur (dec i) (* res i)))))

(println (map factorial (list 0 1 2 3 4 5 6 10)))

(println (String/valueOf \tab) (String/valueOf \c))

(println *command-line-args*)

(println (Integer/parseInt (trim "  12 ")))
