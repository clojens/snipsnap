(ns
  ^{:author "Caleb Peterson", 
       :doc "Access to the system clipboard using AWT"}
  snipsnap.core
  (:import java.awt.Toolkit)
  (:import (java.awt.datatransfer Clipboard
                                  ClipboardOwner
                                  Transferable
                                  StringSelection
                                  DataFlavor)))

(def owner (reify ClipboardOwner
             (lostOwnership [this clipboard contents] ())))

(defn get-clipboard [] (. (Toolkit/getDefaultToolkit)
                          (getSystemClipboard)))

(defn get-content []
  (.getContents (get-clipboard) nil))

(defn set-content! [^Transferable content]
  (let [current (get-content)]
    (.setContents (get-clipboard)
                  content
                  owner)
    current))

(defn get-text []
  (let [content (get-content)]
    (if (.isDataFlavorSupported content DataFlavor/stringFlavor)
        (.getTransferData content DataFlavor/stringFlavor))))

(defn set-text! [^String text]
  (let [current (get-text)]
    (set-content! (StringSelection. text))
    current))
