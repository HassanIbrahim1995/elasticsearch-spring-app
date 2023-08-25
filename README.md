# elasticsearch-spring-appWorkflow:
Filebeat: Monitors Docker logs and sends them to Logstash.
Logstash: Receives logs from both Filebeat (Docker logs) and directly from the Spring App. It then processes these logs and sends them to Elasticsearch.
Elasticsearch: Stores the logs sent from Logstash.
Kibana: Used to visualize and explore the logs stored in Elasticsearch.
