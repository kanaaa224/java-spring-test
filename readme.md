```
docker compose up -d
```

```
docker compose exec app bash
```

```
curl https://start.spring.io/starter.zip \
  -d dependencies=web \
  -d type=gradle-project \
  -d language=java \
  -d bootVersion=3.5.0 \
  -d javaVersion=21 \
  -o app.zip

jar -xf app.zip
rm app.zip
```

```
chmod +x gradlew
./gradlew bootRun
```

```
http://localhost:8080
```

```
code .
```

```
./gradlew javadoc
./gradlew build
```

```
exit
docker compose down
```

```
docker compose stop
docker compose start
```