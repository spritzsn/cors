package io.github.spritzsn.cors

import io.github.spritzsn.spritz.*

def apply(): RequestHandler =
  (req: Request, res: Response) =>
    res.headers("Access-Control-Allow-Origin") = "*"
    HandlerResult.Next
