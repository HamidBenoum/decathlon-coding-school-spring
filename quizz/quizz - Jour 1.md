# Quizz - Jour 1

## Spring Core
* Citer des projets spring (en dehors de Spring Framework) ? (Boot, Security, Data, …)
* Quelles sont les couches que l’on retrouve dans une application d’entreprise ?
* Qu’est ce qu’un Bean ?
* Qu'est ce que l'application context?
* Quels sont les deux moyens de configurer les beans spring ?
* Java Configuration
  * @Configuration
  * @Bean nom de la méthode va donner le nom du bean
* Component Scanning
  * @Component nom de la classe pour donner le nom du bean
  * @Autowired
* Comment lancer une application Spring Boot ?
  * SpringApplication.run
  * Qui retourne quoi ? un ApplicationContext
  * Context.getBean
* Injecter une @Value
* Qu'est ce qu'un stéréotype?
  * Repository, Service, Controller, RestController, Configuration

## Spring Boot
* Quel sous-projet Spring boot permet d'avoir des metrics sur notre application ?
* Comment initialiser à partir de 0, une application Spring Boot ? https://start.spring.io/
* Qu'est ce qu'un starter ? Des exemples ?
* Sur quoi Spring se base t-il pour son autoconfiguration ? (Le classpath, le fichier application.properties ou des – Beans already defined)
* Comment lancer l'autoconfiguration de Spring ? (@EnableAutoConfiguration ou @SpringBootApplication)
* Maven <parent> <dependencies> <build>
* Qu'est ce que le jdbcTemplate ?