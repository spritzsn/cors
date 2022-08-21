package io.github.spritzsn.cors

import io.github.spritzsn.spritz.*

def apply(): RequestHandler =
  (req: Request, res: Response) =>
    res.set("Access-Control-Allow-Origin", "*")
    HandlerResult.Next
