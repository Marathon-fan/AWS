

# Kinesis  ----= managed Kafka 


## 1 partition key  
```
assigned to the data record by the data producer
used for partitioning of data across shards
md5 hash determines shards
```


## 2 sequence Number  
```
unique identifier of a data record
assigned by kinesis on write
```

## 3 shard   
```
a shard is a group of data records in a stream
a stream is composed of multiple shards
you scale Kinesis streams by adding or removing shards
each shard provides a fixed unit of capacity
each shard ingests up to 1 MB/sec of data up to 1000 records/sec
```

## remarks

1 understand the consequences of the limits    
   shards (=Capacity), number of consumers, latency, etc    

2 trade off: Vendor Lock-in vs. managed service.  
    alternative: manage your own Kafka cluster

3 choose the right access library for your use-case
    HTTP, SDK, Client, Producer, Connector, Third party

        
