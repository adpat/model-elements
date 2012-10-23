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
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"CC\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"doc\":\"* Description of the config and state of our networks and related data.\\n *\\n * Note: all units in SI (meters, seconds, etc.) except where specified.\",\"types\":[{\"type\":\"record\",\"name\":\"DateTime\",\"doc\":\"milliseconds, absolute, since epoch, utc\",\"fields\":[{\"name\":\"milliseconds\",\"type\":\"long\"}]},{\"type\":\"record\",\"name\":\"Duration\",\"doc\":\"milliseconds\",\"fields\":[{\"name\":\"milliseconds\",\"type\":\"long\"}]},{\"type\":\"record\",\"name\":\"Node\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"Link\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"laneCount\",\"type\":\"double\"},{\"name\":\"length\",\"type\":\"double\"},{\"name\":\"laneOffset\",\"type\":\"int\",\"default\":0},{\"name\":\"beginId\",\"type\":\"string\"},{\"name\":\"endId\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"Network\",\"fields\":[{\"name\":\"id\",\"type\":\"string\",\"default\":\"1\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"nodes\",\"type\":{\"type\":\"array\",\"items\":\"Node\"},\"default\":[]},{\"name\":\"links\",\"type\":{\"type\":\"array\",\"items\":\"Link\"},\"default\":[]}]},{\"type\":\"record\",\"name\":\"DensityProfile\",\"doc\":\"Density on each link at a point in time\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"vehiclesPerMeter\",\"type\":{\"type\":\"map\",\"values\":\"double\"},\"doc\":\"map key is linkId\",\"default\":{}}]},{\"type\":\"record\",\"name\":\"VelocityProfile\",\"doc\":\"Velocity on each link at a point in time\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"metersPerSecond\",\"type\":{\"type\":\"map\",\"values\":\"double\"},\"doc\":\"map key is linkId\",\"default\":{}}]},{\"type\":\"record\",\"name\":\"FD\",\"doc\":\"Fundamental diagram on one link at one time\",\"fields\":[{\"name\":\"freeFlowSpeed\",\"type\":\"double\"},{\"name\":\"freeFlowSpeedStdev\",\"type\":\"double\"},{\"name\":\"congestionWaveSpeed\",\"type\":\"double\"},{\"name\":\"congestionWaveSpeedStdev\",\"type\":\"double\"},{\"name\":\"capacity\",\"type\":\"double\"},{\"name\":\"capacityStdev\",\"type\":\"double\"},{\"name\":\"jamDensity\",\"type\":\"double\"},{\"name\":\"capacityDrop\",\"type\":\"double\"}]},{\"type\":\"record\",\"name\":\"FDProfile\",\"doc\":\"Fundamental diagrams on each link as time series\",\"fields\":[{\"name\":\"dt\",\"type\":\"double\",\"default\":300.0},{\"name\":\"startTime\",\"type\":\"double\",\"default\":0.0},{\"name\":\"fd\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"FD\"}},\"doc\":\"map key is linkId, array is time series, as per dt and startTime.\",\"default\":{}}]},{\"type\":\"record\",\"name\":\"DemandProfile\",\"doc\":\"Demands on each link as time series\",\"fields\":[{\"name\":\"dt\",\"type\":\"double\",\"default\":300.0},{\"name\":\"startTime\",\"type\":\"double\",\"default\":0.0},{\"name\":\"origin\",\"type\":\"string\",\"doc\":\"link id, may not be null\"},{\"name\":\"destination\",\"type\":\"string\",\"doc\":\"link id, may be null\",\"default\":null},{\"name\":\"demand\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"double\"}},\"doc\":\"map key is linkId, array is time series, as per dt and startTime.\",\"default\":{}}]},{\"type\":\"record\",\"name\":\"SplitRatioProfile\",\"doc\":\"* Split ratio time series at a node. The node ID is not stored\\n   * in this record, but as the map key of the SplitRatioSet.\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"networkId\",\"type\":[\"null\",\"string\"],\"doc\":\"* if null, use the unique network in this scenario.\"},{\"name\":\"destinationNetworkId\",\"type\":[\"null\",\"string\"],\"doc\":\"* if null, this profile governs background flow, not OD flow.\"},{\"name\":\"startTime\",\"type\":[\"null\",\"double\"],\"doc\":\"* in seconds; default is 0\"},{\"name\":\"sampleRate\",\"type\":[\"null\",\"double\"],\"doc\":\"* in seconds; default is 300 seconds\"},{\"name\":\"ratio\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"double\"}}}},\"doc\":\"* time series of ratios;\\n     * map keys are: inLinkId, outLinkId, vehTypeId;\\n     * array index is index in time series (\\\"RATIO_ORDER\\\" in db)\"}]},{\"type\":\"record\",\"name\":\"SplitRatioSet\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":[\"null\",\"string\"]},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"profile\",\"type\":{\"type\":\"map\",\"values\":\"SplitRatioProfile\"},\"doc\":\"* map key is nodeId\"}]},{\"type\":\"record\",\"name\":\"Scenario\",\"doc\":\"* A scenario represents the state of the world now and projected\\n   * into the future, to the extent that can be known in advance.\\n   *\\n   * The configuration that belongs in a scenario and the objects that it\\n   * contains are just those parameters that make an assertion about the \\n   * world, an assertion which is observable, and verifiable. So, for example,\\n   * choice of CTM algorithm does not belong here, but FD parameters do,\\n   * and signal control algorithms do. (The CTM choice should be in the\\n   * Context.)\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"networks\",\"type\":{\"type\":\"array\",\"items\":\"Network\"},\"default\":[]},{\"name\":\"initialDensityProfile\",\"type\":\"DensityProfile\",\"default\":null},{\"name\":\"initialVelocityProfile\",\"type\":\"VelocityProfile\",\"default\":null},{\"name\":\"fdProfile\",\"type\":\"FDProfile\",\"default\":null},{\"name\":\"demandProfile\",\"type\":\"DemandProfile\",\"default\":null},{\"name\":\"splitratioSet\",\"type\":\"SplitRatioSet\",\"default\":null}]},{\"type\":\"record\",\"name\":\"EnKFParams\",\"doc\":\"* Context and Run Config section\\n   *\\n   * Configuration that applies to one run or a group of runs.\\n   *\\n   * These objects correspond to the TBD Run tables.\",\"fields\":[{\"name\":\"n_ensembles\",\"type\":\"int\"}]},{\"type\":\"enum\",\"name\":\"RunMode\",\"symbols\":[\"HISTORICAL\",\"LIVE\"]},{\"type\":\"enum\",\"name\":\"CTMType\",\"symbols\":[\"DENSITY\",\"VELOCITY\",\"FUSION\"]},{\"type\":\"record\",\"name\":\"FreewayContextConfig\",\"doc\":\"* Static configuration of a set of freeway runs.\\n   *\\n   * The parameters encapsulated here are separate from Scenario inputs\\n   * in that they express *how* the run is modeled and executed,\\n   * rather than *what* is modeled.\\n   *\\n   * These parameters are used by the Context subclasses.\\n   *\\n   * Note that a context does not include a scenario. Scenarios are read\\n   * dynamically using a ScenarioSource.\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"runMode\",\"type\":\"RunMode\"},{\"name\":\"enkfParams\",\"type\":\"EnKFParams\"},{\"name\":\"ctmType\",\"type\":\"CTMType\"},{\"name\":\"dtOutput\",\"type\":\"Duration\"},{\"name\":\"dt\",\"type\":\"Duration\"},{\"name\":\"timeBegin\",\"type\":\"DateTime\"},{\"name\":\"timeEnd\",\"type\":\"DateTime\"}]},{\"type\":\"record\",\"name\":\"ProcessConfig\",\"doc\":\"* Encapsulates a single run of a process.\",\"fields\":[{\"name\":\"host\",\"type\":\"string\"},{\"name\":\"pid\",\"type\":\"long\"},{\"name\":\"timeBegin\",\"type\":\"DateTime\",\"doc\":\"Note: wall clock time on host, not world time or sim time\"},{\"name\":\"timeEnd\",\"type\":\"DateTime\"}]},{\"type\":\"record\",\"name\":\"FreewayEstimationRunConfig\",\"doc\":\"* Represents a single execution of the freeway model.\\n   *\\n   * Parameters here supplement the Context config with additional per-run\\n   * config.\\n   *\\n   * The FreewayRun id should be in one-to-one correspondence with actual\\n   * process executions on a host. If you run again with the same parameters\\n   * then the id should be different. Output data references this id.\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"contextId\",\"type\":\"string\",\"doc\":\"Refers to the FreewayContext for this run (among others)\"},{\"name\":\"seeds\",\"type\":{\"type\":\"array\",\"items\":\"long\"}},{\"name\":\"process\",\"type\":\"ProcessConfig\"}]},{\"type\":\"record\",\"name\":\"FreewayForecastRunConfig\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"contextId\",\"type\":\"string\",\"doc\":\"Refers to the FreewayContext for this run (among others)\"},{\"name\":\"seeds\",\"type\":{\"type\":\"array\",\"items\":\"long\"}},{\"name\":\"process\",\"type\":\"ProcessConfig\"}]},{\"type\":\"record\",\"name\":\"SimulationRunConfig\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"CalibrationRunConfig\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"ImputationRunConfig\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"FreewayLinkState\",\"doc\":\"* State of one link at one time.\\n   *\\n   * May contain density, velocity, or both.\",\"fields\":[{\"name\":\"density\",\"type\":[\"double\",\"null\"]},{\"name\":\"velocity\",\"type\":[\"double\",\"null\"]}]},{\"type\":\"record\",\"name\":\"FreewayCTMState\",\"doc\":\"* State of entire CTM\",\"fields\":[{\"name\":\"linkState\",\"type\":{\"type\":\"map\",\"values\":\"FreewayLinkState\"},\"doc\":\"map key is link id\"}]},{\"type\":\"record\",\"name\":\"FreewayCTMEnsembleState\",\"doc\":\"* State of ensemble CTMs in an ordered list.\",\"fields\":[{\"name\":\"ensembleState\",\"type\":{\"type\":\"array\",\"items\":\"FreewayCTMState\"},\"doc\":\"one entry per CTM\"},{\"name\":\"quality\",\"type\":{\"type\":\"map\",\"values\":\"double\"},\"doc\":\"map key is link id\\n     *\\n     * used by FreewayReporterBlock?\"}]}],\"messages\":{}}");

  @SuppressWarnings("all")
  /** * Description of the config and state of our networks and related data.
 *
 * Note: all units in SI (meters, seconds, etc.) except where specified. */
  public interface Callback extends CC {
    public static final org.apache.avro.Protocol PROTOCOL = edu.berkeley.path.model_elements_base.CC.PROTOCOL;
  }
}