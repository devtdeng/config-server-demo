# config-server-demo

## Managing Secrets with CredHub


```bash
$ cf cs p.config-server standard config-server
$ cf service config-server
...
dashboard:        https://config-server-1aba3979-4e41-479a-a8a1-de01108155e1.<DOMAIN>/dashboard
...

# create secrect with curl or `cf config-server-add-credhub-secret` command
$ curl -i -H "Content-Type: application/json" -H "Authorization: $(cf oauth-token)" https://config-server-1aba3979-4e41-479a-a8a1-de01108155e1.<DOMAIN>/secrets/config-server-demo/development/master/mysecret -X PUT --data '{"mysecret": "xxxxxx"}'

$ mvn package -Dmaven.test.skip && cf push 

$ curl http://config-server-demo.<DOMAIN>
mysecret from config server is: xxxxxx
```
