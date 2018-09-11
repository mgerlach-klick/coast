(ns coast
  (:require [potemkin :refer [import-vars]]
            [coast.db]
            [coast.eta]
            [coast.env]
            [coast.time]
            [coast.components]
            [coast.responses]
            [coast.utils]
            [coast.error]
            [coast.router]
            [coast.jobs]
            [coast.validation]
            [coast.middleware]))

(import-vars
  [coast.responses
   ok
   not-found
   unauthorized
   internal-server-error
   redirect
   flash]

  [coast.error
   raise
   rescue]

  [coast.db
   q
   pull
   transact
   delete
   first!]

  [coast.validation
   validate]

  [coast.components
   form
   js
   css]

  [coast.middleware
   wrap-layout
   wrap-site
   wrap-api]

  [coast.router
   wrap-routes
   prefix-routes]

  [coast.eta
   server
   app
   url-for
   action-for]

  [coast.env
   env]

  [coast.jobs
   queue]

  [coast.utils
   uuid]

  [coast.time
   now])
