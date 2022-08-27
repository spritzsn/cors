package io.github.spritzsn.cors

import io.github.spritzsn.spritz.*

def apply(): RequestHandler =
  (req, res) =>
    res.set("Access-Control-Allow-Origin", "*")
    HandlerResult.Next
