# elasticsearch-spring-app Workflow:

## Steps:

1. **Filebeat**: 
   - Monitors Docker logs.
   - Sends logs to Logstash.
   
2. **Logstash**:
   - Receives logs from both Filebeat (Docker logs) and directly from the Spring App.
   - Processes these logs.
   - Sends them to Elasticsearch.
   
3. **Elasticsearch**:
   - Stores the logs sent from Logstash.
   
4. **Kibana**:
   - Used to visualize and explore the logs stored in Elasticsearch.

