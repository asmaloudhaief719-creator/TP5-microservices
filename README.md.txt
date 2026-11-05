# TP5 : Architecture technique des micro-services

Application de facturation basée sur Spring Boot et Spring Cloud.

| Service | Port | Rôle |
|---|---|---|
| discovery-service | 8761 | Annuaire Eureka |
| gateway-service | 8888 | Spring Cloud Gateway |
| customer-service | 8081 | Gestion des clients |
| inventory-service | 8082 | Gestion des produits |
| billing-service | 8083 | Gestion des factures (OpenFeign) |

## Ordre de lancement
1. discovery-service
2. customer-service et inventory-service
3. billing-service
4. gateway-service

## URL de test
- http://localhost:8888/BILLING-SERVICE/fullBill/1