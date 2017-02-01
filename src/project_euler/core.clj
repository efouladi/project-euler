9(ns project-euler.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

  (def factorial
    (fn [n]
      (loop [cnt n acc 1]
         (if (zero? cnt)
              acc
            (recur (dec cnt) (* acc cnt))
  ; in loop cnt will take the value (dec cnt)
  ; and acc will take the value (* acc cnt)
  ))))

 ; Problem 1
  (defn mul5or3 [x] (or (= 0 (mod x 3)) (= 0 (mod x 5))))))
  (reduce + (filter mul5or3 (range 1 1000)))

  ; Problem 2
  (defn fib [x] (if (< x 3) x (+ (fib (dec x)) (fib (- x 2)))))
  (defn test [x] (< x 4000000))
  (reduce + (filter even? (take-while test (map fib (range)))))


