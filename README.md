# 🛰️ Localização SSI (Estação Espacial Internacional)

Este projeto é uma aplicação web que rastreia em tempo real a posição da Estação Espacial Internacional (ISS), integrando uma API pública com visualização geográfica interativa.

## 🚀 Tecnologias Utilizadas

- **Spring Boot** – Backend em Java com API REST
- **Leaflet.js** – Mapa interativo no front-end
- **HTML, CSS moderno e JavaScript**
- **Open Notify API** – Fonte de dados da ISS

## 🌍 Funcionalidades

- Consulta em tempo real da posição da ISS
- Mapa interativo com marcador personalizado
- Atualização automática a cada 10 segundos
- Trajetória orbital simulada com linhas verdes
- Interface responsiva e visual moderno

## 📦 Como executar

### Backend (Spring Boot)

```bash
# Clonar o repositório
git clone https://github.com/RafaelEliasIoppi/localizacao_SSI.git
cd localizacao_SSI

# Rodar o projeto
./mvnw spring-boot:run
