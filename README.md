
# SafeWaterAPI - DevOps Entrega

Este repositório contém a versão containerizada da API Java `SafeWaterAPI` para entrega da disciplina DevOps.

##  Componentes

- Container da aplicação Java (Spring Boot)
- Container do banco de dados PostgreSQL

## ▶Como Executar

1. Clone o repositório:
```
git clone https://github.com/seu-usuario/safewater-api-devops.git
cd safewater-api-devops
```

2. Suba os containers:
```
docker-compose up --build -d
```

3. Acesse o Swagger:
```
http://localhost:8080/swagger-ui.html
```

4. Teste os endpoints (CRUD completo) no Swagger

5. Verifique os logs:
```
docker logs -f safewater-api
docker logs -f safewater-db
```

## Requisitos Atendidos

- Dockerfile e docker-compose
- Dois containers (API + banco)
- Persistência no PostgreSQL
- CRUD completo funcional
- Documentação no Swagger


🎥 Playlist dos vídeos: https://www.youtube.com/playlist?list=PLCQzok-3zgo1lscp7GIM0D58iPvgiH84t
