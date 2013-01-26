/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements_base;

@SuppressWarnings("all")
/** * Description of the config and state of our networks and related data.
 *
 * Note: all units in SI (meters, seconds, etc.) except where specified. */
public interface CC {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"CC\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"doc\":\"* Description of the config and state of our networks and related data.\\r\\n *\\r\\n * Note: all units in SI (meters, seconds, etc.) except where specified.\",\"types\":[{\"type\":\"record\",\"name\":\"DateTime\",\"doc\":\"milliseconds, absolute, since epoch, utc\",\"fields\":[{\"name\":\"milliseconds\",\"type\":\"long\"}]},{\"type\":\"record\",\"name\":\"Duration\",\"doc\":\"milliseconds\",\"fields\":[{\"name\":\"milliseconds\",\"type\":\"long\"}]},{\"type\":\"record\",\"name\":\"Node\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"latitude\",\"type\":\"double\"},{\"name\":\"longitude\",\"type\":\"double\"}]},{\"type\":\"record\",\"name\":\"Link\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"laneCount\",\"type\":[\"null\",\"double\"]},{\"name\":\"length\",\"type\":[\"null\",\"double\"]},{\"name\":\"laneOffset\",\"type\":[\"null\",\"int\"],\"doc\":\"* index of the first lane of this link in case the road is\\r\\n     * divided into paralell links.\"},{\"name\":\"speedLimit\",\"type\":[\"null\",\"double\"]},{\"name\":\"detailLevel\",\"type\":[\"null\",\"int\"]},{\"name\":\"beginId\",\"type\":\"string\"},{\"name\":\"endId\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"Network\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"projectId\",\"type\":[\"null\",\"string\"]},{\"name\":\"nodes\",\"type\":{\"type\":\"array\",\"items\":\"Node\"},\"default\":[]},{\"name\":\"links\",\"type\":{\"type\":\"array\",\"items\":\"Link\"},\"default\":[]},{\"name\":\"modstamp\",\"type\":\"long\"}]},{\"type\":\"record\",\"name\":\"DensityMap\",\"doc\":\"* Density on each link at a point in time\",\"fields\":[{\"name\":\"vehiclesPerMeter\",\"type\":{\"type\":\"map\",\"values\":\"double\"},\"doc\":\"map key is linkId\",\"default\":{}}]},{\"type\":\"record\",\"name\":\"DensitySet\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"projectId\",\"type\":[\"null\",\"string\"]},{\"name\":\"density\",\"type\":\"DensityMap\"}]},{\"type\":\"record\",\"name\":\"VelocityMap\",\"doc\":\"* Velocity on each link at a point in time\",\"fields\":[{\"name\":\"metersPerSecond\",\"type\":{\"type\":\"map\",\"values\":\"double\"},\"doc\":\"map key is linkId\",\"default\":{}}]},{\"type\":\"record\",\"name\":\"VelocitySet\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"projectId\",\"type\":[\"null\",\"string\"]},{\"name\":\"velocity\",\"type\":\"VelocityMap\"}]},{\"type\":\"record\",\"name\":\"FDType\",\"doc\":\"* Referenced by FDSet to indicate the way the contained FDs should\\r\\n   * be interpreted.\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":[\"null\",\"string\"]},{\"name\":\"description\",\"type\":[\"null\",\"string\"]}]},{\"type\":\"record\",\"name\":\"FD\",\"doc\":\"* Fundamental diagram parameters on one link at one time.\\r\\n   * Flow and density values are per lane in SI units.\",\"fields\":[{\"name\":\"freeFlowSpeed\",\"type\":[\"null\",\"double\"]},{\"name\":\"criticalSpeed\",\"type\":[\"null\",\"double\"]},{\"name\":\"congestionWaveSpeed\",\"type\":[\"null\",\"double\"]},{\"name\":\"capacity\",\"type\":[\"null\",\"double\"]},{\"name\":\"jamDensity\",\"type\":[\"null\",\"double\"]},{\"name\":\"capacityDrop\",\"type\":[\"null\",\"double\"]},{\"name\":\"freeFlowSpeedStd\",\"type\":[\"null\",\"double\"]},{\"name\":\"congestionWaveSpeedStd\",\"type\":[\"null\",\"double\"]},{\"name\":\"capacityStd\",\"type\":[\"null\",\"double\"]}]},{\"type\":\"record\",\"name\":\"FDProfile\",\"doc\":\"* FD time series at a link. The link ID is not stored\\r\\n   * in this record, but as the map key in the FDSet.profile.\",\"fields\":[{\"name\":\"startTime\",\"type\":[\"null\",\"double\"],\"doc\":\"* in seconds; default is 0\",\"default\":0.0},{\"name\":\"sampleRate\",\"type\":[\"null\",\"double\"],\"doc\":\"* in seconds; default is 300 seconds\",\"default\":300.0},{\"name\":\"fd\",\"type\":{\"type\":\"array\",\"items\":\"FD\"},\"doc\":\"* time series of FDs;\\r\\n     * array index is index in time series (\\\"DIAG_ORDER\\\" in db)\"}]},{\"type\":\"record\",\"name\":\"FDSet\",\"doc\":\"* Specification of Fundamental diagram time series across one or more\\r\\n   * networks, for use in a scenario.\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":[\"null\",\"string\"]},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"projectId\",\"type\":[\"null\",\"string\"]},{\"name\":\"type\",\"type\":\"FDType\"},{\"name\":\"profile\",\"type\":{\"type\":\"map\",\"values\":\"FDProfile\"},\"doc\":\"* map key is linkId\"},{\"name\":\"modstamp\",\"type\":\"long\"}]},{\"type\":\"record\",\"name\":\"FDMap\",\"doc\":\"* Used to feed a per-timestep \\\"drip\\\" input to freeway model.\\r\\n   * This is sliced off of FDSet at a given time.\\r\\n   *\\r\\n   * Not part of Scenario; can be used interchangeably for\\r\\n   * real-time input or for sliced up profiles from a scenario.\",\"fields\":[{\"name\":\"fd\",\"type\":{\"type\":\"map\",\"values\":\"FD\"},\"doc\":\"* map of FDs at a given time;\\r\\n     * map key is linkId\"}]},{\"type\":\"record\",\"name\":\"DemandProfile\",\"doc\":\"* Demand time series at a link. The origin link ID is not stored\\r\\n   * in this record, but as the map key in the DemandSet.profile.\",\"fields\":[{\"name\":\"destinationNetworkId\",\"type\":[\"null\",\"string\"],\"doc\":\"* if null, this profile governs background flow, not OD flow.\"},{\"name\":\"startTime\",\"type\":[\"null\",\"double\"],\"doc\":\"* in seconds; default is 0\",\"default\":0.0},{\"name\":\"sampleRate\",\"type\":[\"null\",\"double\"],\"doc\":\"* in seconds; default is 300 seconds\",\"default\":300.0},{\"name\":\"knob\",\"type\":[\"null\",\"double\"],\"doc\":\"* demand scale factor\",\"default\":1.0},{\"name\":\"stdDevAdd\",\"type\":[\"null\",\"double\"],\"default\":0.0},{\"name\":\"stdDevMult\",\"type\":[\"null\",\"double\"],\"default\":1.0},{\"name\":\"flow\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"double\"}},\"doc\":\"* time series of flows;\\r\\n     * map keys is vehTypeId;\\r\\n     * array index is index in time series (\\\"DEMAND_ORDER\\\" in db)\"}]},{\"type\":\"record\",\"name\":\"DemandSet\",\"doc\":\"* Specification of demand time series across one or more networks,\\r\\n   * for use in a scenario.\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":[\"null\",\"string\"]},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"projectId\",\"type\":[\"null\",\"string\"]},{\"name\":\"profile\",\"type\":{\"type\":\"map\",\"values\":\"DemandProfile\"},\"doc\":\"* map key is originLinkId\"},{\"name\":\"modstamp\",\"type\":\"long\"}]},{\"type\":\"record\",\"name\":\"DemandMap\",\"doc\":\"* Used to feed a per-timestep \\\"drip\\\" input to freeway model.\\r\\n   * This is sliced off of DemandSet at a given time.\\r\\n   *\\r\\n   * Not part of Scenario; can be used interchangeably for \\r\\n   * real-time input or for sliced up profiles from a scenario.\",\"fields\":[{\"name\":\"flow\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":\"double\"}},\"doc\":\"* map of flows at a given time;\\r\\n     * map keys are: originLinkId, vehTypeId;\"}]},{\"type\":\"record\",\"name\":\"SplitRatioProfile\",\"doc\":\"* Split ratio time series at a node. The node ID is not stored\\r\\n   * in this record, but as the map key in the SplitRatioSet.profile.\",\"fields\":[{\"name\":\"destinationNetworkId\",\"type\":[\"null\",\"string\"],\"doc\":\"* if null, this profile governs background flow, not OD flow.\"},{\"name\":\"startTime\",\"type\":[\"null\",\"double\"],\"doc\":\"* in seconds; default is 0\",\"default\":0.0},{\"name\":\"sampleRate\",\"type\":[\"null\",\"double\"],\"doc\":\"* in seconds; default is 300 seconds\",\"default\":300.0},{\"name\":\"ratio\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"double\"}}}},\"doc\":\"* time series of ratios;\\r\\n     * map keys are: inLinkId, outLinkId, vehTypeId;\\r\\n     * array index is index in time series (\\\"RATIO_ORDER\\\" in db)\"}]},{\"type\":\"record\",\"name\":\"SplitRatioSet\",\"doc\":\"* Specification of split ratio time series across one or more networks,\\r\\n   * for use in a scenario.\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":[\"null\",\"string\"]},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"projectId\",\"type\":[\"null\",\"string\"]},{\"name\":\"profile\",\"type\":{\"type\":\"map\",\"values\":\"SplitRatioProfile\"},\"doc\":\"* map key is nodeId\"},{\"name\":\"modstamp\",\"type\":\"long\"}]},{\"type\":\"record\",\"name\":\"SplitRatioMap\",\"doc\":\"* Used to feed a per-timestep \\\"drip\\\" input to freeway model.\\r\\n   * This is sliced off of SplitRatioSet at a given time.\\r\\n   *\\r\\n   * Not part of Scenario; can be used interchangeably for \\r\\n   * real-time input or for sliced up profiles from a scenario.\",\"fields\":[{\"name\":\"ratio\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":\"double\"}}}},\"doc\":\"* map of ratios at a given time;\\r\\n     * map keys are: nodeId, inLinkId, outLinkId, vehTypeId;\"}]},{\"type\":\"record\",\"name\":\"Sensor\",\"doc\":\"* Sensor that can describe loop detector, magnetic detector, TMC,\\r\\n   * camera, radar, etc.\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"doc\":\"* \\\"Loop\\\", etc. Translated to numeric type in the DB.\"},{\"name\":\"entityId\",\"type\":[\"null\",\"string\"],\"doc\":\"* ID of original detector, e.g. VDS ID\"},{\"name\":\"measurementFeedId\",\"type\":[\"null\",\"string\"],\"doc\":\"* data feed associated with this sensor\"},{\"name\":\"linkId\",\"type\":\"string\"},{\"name\":\"linkOffset\",\"type\":\"double\",\"default\":0},{\"name\":\"laneNum\",\"type\":\"double\",\"default\":1},{\"name\":\"healthStatus\",\"type\":\"double\",\"doc\":\"* healthy by default\",\"default\":1}]},{\"type\":\"record\",\"name\":\"SensorSet\",\"doc\":\"* Set of sensors residing on links in potentially multiple networks.\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":[\"null\",\"string\"]},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"projectId\",\"type\":[\"null\",\"string\"]},{\"name\":\"sensors\",\"type\":{\"type\":\"array\",\"items\":\"Sensor\"}},{\"name\":\"modstamp\",\"type\":\"long\"}]},{\"type\":\"record\",\"name\":\"Project\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"modstamp\",\"type\":\"long\"}]},{\"type\":\"record\",\"name\":\"Scenario\",\"doc\":\"* A scenario represents the state of the world now and projected\\r\\n   * into the future, to the extent that can be known in advance.\\r\\n   *\\r\\n   * The configuration that belongs in a scenario and the objects that it\\r\\n   * contains are just those parameters that make an assertion about the \\r\\n   * world, an assertion which is observable, and verifiable. So, for example,\\r\\n   * choice of CTM algorithm does not belong here, but FD parameters do,\\r\\n   * and signal control algorithms do. (The CTM choice should be in the\\r\\n   * Context.)\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"projectId\",\"type\":[\"null\",\"string\"]},{\"name\":\"networks\",\"type\":{\"type\":\"array\",\"items\":\"Network\"},\"default\":[]},{\"name\":\"initialDensity\",\"type\":\"DensitySet\",\"default\":null},{\"name\":\"initialVelocity\",\"type\":\"VelocitySet\",\"default\":null},{\"name\":\"fdSet\",\"type\":\"FDSet\",\"default\":null},{\"name\":\"demandSet\",\"type\":\"DemandSet\",\"default\":null},{\"name\":\"splitratioSet\",\"type\":\"SplitRatioSet\",\"default\":null},{\"name\":\"sensorSet\",\"type\":\"SensorSet\",\"default\":null},{\"name\":\"modstamp\",\"type\":\"long\"}]},{\"type\":\"record\",\"name\":\"EnKFParams\",\"doc\":\"* Context and Run Config section\\r\\n   *\\r\\n   * Configuration that applies to one run or a group of runs.\\r\\n   *\\r\\n   * These objects correspond to the TBD Run tables.\",\"fields\":[{\"name\":\"confidenceDefault\",\"type\":\"double\"},{\"name\":\"confidenceHasMeasurement\",\"type\":\"double\"},{\"name\":\"confidenceNoMeasurement\",\"type\":\"double\"},{\"name\":\"confidenceMeasurementLifetime\",\"type\":\"double\"},{\"name\":\"localizationDistance\",\"type\":\"double\"},{\"name\":\"useLocalization\",\"type\":\"boolean\"},{\"name\":\"modelNoiseMean\",\"type\":\"double\"},{\"name\":\"modelNoiseStdev\",\"type\":\"double\"},{\"name\":\"navteqNoiseMean\",\"type\":\"double\"},{\"name\":\"navteqNoiseStdev\",\"type\":\"double\"},{\"name\":\"navteqPercentage\",\"type\":\"double\"},{\"name\":\"PemsBlackList\",\"type\":{\"type\":\"array\",\"items\":\"int\"}},{\"name\":\"pemsNoiseMean\",\"type\":\"double\"},{\"name\":\"pemsNoiseStdev\",\"type\":\"double\"},{\"name\":\"telenavNoiseMean\",\"type\":\"double\"},{\"name\":\"telenavNoiseStdev\",\"type\":\"double\"},{\"name\":\"telenavPercentage\",\"type\":\"double\"}]},{\"type\":\"record\",\"name\":\"ProcessConfig\",\"doc\":\"* Encapsulates a single run of a process.\",\"fields\":[{\"name\":\"host\",\"type\":\"string\"},{\"name\":\"pid\",\"type\":\"long\"},{\"name\":\"timeBegin\",\"type\":\"DateTime\",\"doc\":\"Note: wall clock time on host, not world time or sim time\"},{\"name\":\"timeEnd\",\"type\":\"DateTime\"}]},{\"type\":\"record\",\"name\":\"FreewayEstimationRunConfig\",\"doc\":\"* Represents a single execution of the freeway model.\\r\\n   *\\r\\n   * Parameters here supplement the Context config with additional per-run\\r\\n   * config.\\r\\n   *\\r\\n   * The FreewayRun id should be in one-to-one correspondence with actual\\r\\n   * process executions on a host. If you run again with the same parameters\\r\\n   * then the id should be different. Output data references this id.\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"contextId\",\"type\":\"string\",\"doc\":\"Refers to the FreewayContext for this run (among others)\"},{\"name\":\"seeds\",\"type\":{\"type\":\"array\",\"items\":\"long\"}},{\"name\":\"process\",\"type\":\"ProcessConfig\"}]},{\"type\":\"record\",\"name\":\"FreewayForecastRunConfig\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"contextId\",\"type\":\"string\",\"doc\":\"Refers to the FreewayContext for this run (among others)\"},{\"name\":\"seeds\",\"type\":{\"type\":\"array\",\"items\":\"long\"}},{\"name\":\"process\",\"type\":\"ProcessConfig\"}]},{\"type\":\"record\",\"name\":\"SimulationRunConfig\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"CalibrationRunConfig\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"ImputationRunConfig\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"FreewayLinkState\",\"doc\":\"* State of one link at one time.\\r\\n   *\\r\\n   * May contain density, velocity, or both.\",\"fields\":[{\"name\":\"density\",\"type\":[\"double\",\"null\"]},{\"name\":\"velocity\",\"type\":[\"double\",\"null\"]}]},{\"type\":\"record\",\"name\":\"FreewayLinkFlowState\",\"doc\":\"* In- and out-flow state of one link at one time.\\r\\n   *\\r\\n   * The in- and out-flows are a quantity of interest computed by a CTM,\\r\\n   * though not needed for either estimation of future time steps of a CTM.\",\"fields\":[{\"name\":\"inFlow\",\"type\":\"double\"},{\"name\":\"outFlow\",\"type\":\"double\"}]},{\"type\":\"record\",\"name\":\"FreewayCTMState\",\"doc\":\"* State of entire CTM, comprising:\\r\\n   * state of each link,\\r\\n   * state of each origin queue, and\\r\\n   * optionally the in- and out-flows of each link.\",\"fields\":[{\"name\":\"linkState\",\"type\":{\"type\":\"map\",\"values\":\"FreewayLinkState\"},\"doc\":\"map key is link id\"},{\"name\":\"queueLength\",\"type\":{\"type\":\"map\",\"values\":\"double\"},\"doc\":\"map key is origin link id\"},{\"name\":\"linkFlowState\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"FreewayLinkFlowState\"}],\"doc\":\"map key is link id\"}]},{\"type\":\"record\",\"name\":\"FreewayCTMEnsembleState\",\"doc\":\"* State of ensemble CTMs in an ordered list.\",\"fields\":[{\"name\":\"ensembleState\",\"type\":{\"type\":\"array\",\"items\":\"FreewayCTMState\"},\"doc\":\"one entry per CTM\"},{\"name\":\"t\",\"type\":\"DateTime\"},{\"name\":\"quality\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"double\"}],\"doc\":\"map key is link id\\r\\n     *\\r\\n     * used by FreewayReporterBlock?\"}]},{\"type\":\"record\",\"name\":\"FreewayCTMReport\",\"fields\":[{\"name\":\"runId\",\"type\":\"long\"},{\"name\":\"networkId\",\"type\":\"string\"},{\"name\":\"time\",\"type\":\"DateTime\",\"doc\":\"Model time, of course\"},{\"name\":\"mean\",\"type\":\"FreewayCTMState\"},{\"name\":\"stdDev\",\"type\":\"FreewayCTMState\"},{\"name\":\"fd\",\"type\":\"FDMap\"},{\"name\":\"includesFlows\",\"type\":\"boolean\"}]},{\"type\":\"record\",\"name\":\"FreewayCTMEnsembleReport\",\"fields\":[{\"name\":\"runId\",\"type\":\"long\"},{\"name\":\"networkId\",\"type\":\"string\"},{\"name\":\"ensembleState\",\"type\":\"FreewayCTMEnsembleState\"}]},{\"type\":\"record\",\"name\":\"PeMS\",\"doc\":\"* PeMS sensor datum as output by PeMS filter, for a specific\\r\\n   * station and time.\",\"fields\":[{\"name\":\"vdsId\",\"type\":\"long\"},{\"name\":\"timeMeasured\",\"type\":\"DateTime\"},{\"name\":\"flow\",\"type\":[\"double\",\"null\"]},{\"name\":\"density\",\"type\":[\"double\",\"null\"]},{\"name\":\"densityError\",\"type\":[\"double\",\"null\"]},{\"name\":\"speed\",\"type\":[\"double\",\"null\"]},{\"name\":\"speedError\",\"type\":[\"double\",\"null\"]},{\"name\":\"freeFlowSpeed\",\"type\":[\"double\",\"null\"]},{\"name\":\"funcLoopFact\",\"type\":[\"double\",\"null\"]},{\"name\":\"gFactorLane\",\"type\":{\"type\":\"array\",\"items\":[\"double\",\"null\"]}}]},{\"type\":\"record\",\"name\":\"PeMSMap\",\"doc\":\"* PeMS sensor data map, organized by VDS.\",\"fields\":[{\"name\":\"pems\",\"type\":{\"type\":\"map\",\"values\":\"PeMS\"},\"doc\":\"* Key is VDS id. Represents the state of the sensors at\\r\\n     * one point in time.\"}]},{\"type\":\"record\",\"name\":\"PeMSProfile\",\"doc\":\"* PeMS sensor data profile. Represents the time history of\\r\\n   * one sensor.\",\"fields\":[{\"name\":\"pems\",\"type\":{\"type\":\"array\",\"items\":\"PeMS\"}}]},{\"type\":\"record\",\"name\":\"PeMSSet\",\"doc\":\"* PeMS sensor data set, organized as a time-series\\r\\n   * of maps. This makes sense because filtered pems data\\r\\n   * is generated at multiples of 30 seconds: 00:00, 00:30, ...\",\"fields\":[{\"name\":\"pemsMap\",\"type\":{\"type\":\"array\",\"items\":\"PeMSMap\"}}]},{\"type\":\"record\",\"name\":\"PeMSStation\",\"doc\":\"* PeMS sensor (the VDS station info, rather than the sensor data).\",\"fields\":[{\"name\":\"Id\",\"type\":\"long\"},{\"name\":\"fwyNum\",\"type\":\"int\"},{\"name\":\"direction\",\"type\":\"string\"},{\"name\":\"district\",\"type\":\"int\"},{\"name\":\"county\",\"type\":\"string\"},{\"name\":\"city\",\"type\":\"string\"},{\"name\":\"statePostmile\",\"type\":\"double\"},{\"name\":\"absPostmile\",\"type\":\"double\"},{\"name\":\"latitude\",\"type\":\"double\"},{\"name\":\"longitude\",\"type\":\"double\"},{\"name\":\"detectorLength\",\"type\":\"double\"},{\"name\":\"detectorType\",\"type\":\"string\"},{\"name\":\"detectorName\",\"type\":\"string\"},{\"name\":\"laneCount\",\"type\":\"int\"},{\"name\":\"userId\",\"type\":{\"type\":\"array\",\"items\":\"string\"}}]},{\"type\":\"record\",\"name\":\"PeMSAggregate\",\"doc\":\"* Used in both the 5 minute and 1 hour case for per-lane\\r\\n   * and per-station aggregated data, and in the 1 day case\\r\\n   * for per-station aggregated data.\\r\\n   *\",\"fields\":[{\"name\":\"samples\",\"type\":[\"long\",\"null\"]},{\"name\":\"flow\",\"type\":[\"double\",\"null\"]},{\"name\":\"avgOccupancy\",\"type\":[\"double\",\"null\"]},{\"name\":\"avgSpeed\",\"type\":[\"double\",\"null\"]},{\"name\":\"observed\",\"type\":[\"double\",\"null\"]}]},{\"type\":\"record\",\"name\":\"PeMSStationAggregate\",\"doc\":\"* Represents both the 5 minute and 1 hour aggregated data. If delay map\\r\\n   * is present, then it represents a daily aggregate.\\r\\n   *\",\"fields\":[{\"name\":\"vdsId\",\"type\":\"long\"},{\"name\":\"timeMeasured\",\"type\":\"DateTime\"},{\"name\":\"total\",\"type\":\"PeMSAggregate\",\"doc\":\"* Aggregated at this station, across lanes.\\r\\n     *\"},{\"name\":\"byLane\",\"type\":[{\"type\":\"array\",\"items\":\"PeMSAggregate\"},\"null\"],\"doc\":\"* Aggregated by lane at this station.\\r\\n     * Field is null for 1 day aggregates.\\r\\n     *\"},{\"name\":\"delay\",\"type\":[{\"type\":\"map\",\"values\":\"double\"},\"null\"],\"doc\":\"* Average delay over the station length, for a threshold speed.\\r\\n     * Keys are speeds in mph: \\\"35\\\", \\\"40\\\", ... \\\"60\\\".\\r\\n     * Field is null for 5 minute aggregates.\\r\\n     *\"}]},{\"type\":\"record\",\"name\":\"PifProbeCoord\",\"doc\":\"* One data point in the output of the Path Inference Filter.\\r\\n   *\\r\\n   * This record is designed to hold one of the results of a query \\r\\n   * by run_id, network_id, link_id, and time interval. Hence the record\\r\\n   * itself contains none of those, which the caller should keep track of.\\r\\n   * (Or maybe we should have a PifProbeCoordSet to do that.)\\r\\n   *\",\"fields\":[{\"name\":\"time\",\"type\":\"DateTime\",\"doc\":\"* time of measurement\\r\\n     *\"},{\"name\":\"offset\",\"type\":\"double\",\"doc\":\"* offset, in meters, in the direction of travel, in the queried link.\\r\\n     *\"},{\"name\":\"speed\",\"type\":\"double\",\"doc\":\"* measured speed, in meters per second\\r\\n     *\"},{\"name\":\"probability\",\"type\":\"double\",\"doc\":\"* probability that this point was placed correctly, in the range 0..1.\\r\\n     *\"}]},{\"type\":\"record\",\"name\":\"RunConfig\",\"doc\":\"* Configuration of a freeway run.\\r\\n   * Includes algorithm parameters for CTM & EnKF,\\r\\n   * start/stop time etc,\\r\\n   * and input/output parameters such as where to write reports to.\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"runMode\",\"type\":\"string\",\"doc\":\"* historical, live\\r\\n     *\"},{\"name\":\"workflow\",\"type\":\"string\",\"doc\":\"* forecast, estimation\\r\\n     *\"},{\"name\":\"feed\",\"type\":\"string\",\"doc\":\"* probea, probeb, pems\\r\\n    *\"},{\"name\":\"ctmType\",\"type\":\"string\"},{\"name\":\"ensembleSize\",\"type\":\"int\"},{\"name\":\"fdType\",\"type\":\"string\"},{\"name\":\"additiveModelNoiseMean\",\"type\":\"double\"},{\"name\":\"additiveModelNoiseStdDev\",\"type\":\"double\"},{\"name\":\"additiveVelocityFunctionNoiseMean\",\"type\":\"double\"},{\"name\":\"additiveVelocityFunctionNoiseStdDev\",\"type\":\"double\"},{\"name\":\"initialDensityFraction\",\"type\":\"double\"},{\"name\":\"enkfType\",\"type\":\"string\"},{\"name\":\"enkfParams\",\"type\":\"EnKFParams\"},{\"name\":\"dtOutput\",\"type\":\"Duration\"},{\"name\":\"reportStatisticsAfterCTM\",\"type\":\"boolean\"},{\"name\":\"reportEnsembleAfterCTM\",\"type\":\"boolean\"},{\"name\":\"reportStatisticsAfterEnKF\",\"type\":\"boolean\"},{\"name\":\"reportEnsembleAfterEnKF\",\"type\":\"boolean\"},{\"name\":\"reportToDB\",\"type\":\"boolean\"},{\"name\":\"reportToDirectory\",\"type\":\"boolean\"},{\"name\":\"reportDirectory\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"dt\",\"type\":\"Duration\"},{\"name\":\"timeBegin\",\"type\":\"DateTime\"},{\"name\":\"timeEnd\",\"type\":\"DateTime\"},{\"name\":\"sensorSet\",\"type\":[\"null\",\"SensorSet\"]},{\"name\":\"initialEnsembleState\",\"type\":[\"null\",\"FreewayCTMEnsembleState\"]},{\"name\":\"initialState\",\"type\":[\"null\",\"FreewayCTMState\"]},{\"name\":\"initialStateUncertainty\",\"type\":\"double\",\"default\":0.0}]}],\"messages\":{}}");

  @SuppressWarnings("all")
  /** * Description of the config and state of our networks and related data.
 *
 * Note: all units in SI (meters, seconds, etc.) except where specified. */
  public interface Callback extends CC {
    public static final org.apache.avro.Protocol PROTOCOL = edu.berkeley.path.model_elements_base.CC.PROTOCOL;
  }
}