# docker-luminus-example

example dockerized clojure web app

## Prerequisites

You will need [docker][1] and [docker-compose][2].

[1]: https://docs.docker.com/engine/installation/linux/docker-ce/ubuntu/
[2]: https://docs.docker.com/compose/install/

And editor with repl: atom (proto-repl) or emacs (cider)

for atom users:
```bash
apm install proto-repl ink
```

for emacs users:
- folow https://cider.readthedocs.io/en/latest/installation/

## Running

- To start a repl for the edito, run:

    docker-compose up repl

- Connect to repl using your favorite editor
- Tun app

```clojure
(do (migrate) (start))
```
- open http://localhost:3000/swagger-ui/index.html


## License

Copyright © 2017 Mateusz Probachta
