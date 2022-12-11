package org.apache.flink.api.java.io.redis;

import org.apache.flink.configuration.ConfigOption;

import java.util.Arrays;
import java.util.List;

import static org.apache.flink.configuration.ConfigOptions.key;



/**
 * Options for redis.
 */
public class RedisOptions {




	public static final ConfigOption<String> HOST = key("host".toLowerCase()).noDefaultValue();
	public static final ConfigOption<String> PORT = key("port".toLowerCase()).noDefaultValue();
	public static final ConfigOption<String> PASSWORD = key("password".toLowerCase()).noDefaultValue();
	public static final ConfigOption<String> BATH_SIZE = key("batchsize".toLowerCase()).noDefaultValue();
	public static final ConfigOption<String> DB = key("db".toLowerCase()).noDefaultValue();
	public static final ConfigOption<String> BLINKENVIRONMENTTYPEKEY = key("blinkenvironmenttypekey".toLowerCase()).noDefaultValue();
	public static final ConfigOption<String> __INNER__BLINK_STS_ENDPOINTS__ = key("__inner__blink_sts_endpoints__".toLowerCase()).noDefaultValue();
	public static final ConfigOption<String> __INNER__TABLENAME__ = key("__inner__tablename__".toLowerCase()).noDefaultValue();
	public static final ConfigOption<String> __TABLENAME__ = key("__tablename__".toLowerCase()).noDefaultValue();
	public static final ConfigOption<String> CONNECTOR_GROUP = key("connector.group".toLowerCase()).noDefaultValue();
	public static final ConfigOption<String> CONNECTOR_PROPERTY_VERSION = key("connector.property-version".toLowerCase()).noDefaultValue();
	public static final ConfigOption<String> SCHEMA = key("schema".toLowerCase()).noDefaultValue();
	public static final ConfigOption<String> STARTTIME = key("starttime".toLowerCase()).noDefaultValue();
	public static final ConfigOption<String> TIMEZONE = key("timezone".toLowerCase()).noDefaultValue();
	public static final ConfigOption<String> TYPE = key("type".toLowerCase()).noDefaultValue();
	public static final ConfigOption<String> __INNER__JOBNAME__ = key("__inner__jobname__".toLowerCase()).noDefaultValue();
	public static final ConfigOption<String> __INNER__PROJECTNAME__ = key("__inner__projectname__".toLowerCase()).noDefaultValue();
	public static final ConfigOption<String> __INNER_ZK_QUORUM__ = key("__inner_zk_quorum__".toLowerCase()).noDefaultValue();
	public static final ConfigOption<String> CONNECTOR_TYPE = key("connector.type".toLowerCase()).noDefaultValue();
	public static final ConfigOption<String> STARTTIMEMS = key("starttimems".toLowerCase()).noDefaultValue();


	public static final List<String> SUPPORTED_KEYS = Arrays.asList(PASSWORD.key()
			, HOST.key()
			, PORT.key()
			, BATH_SIZE.key()
			, DB.key()
			,BLINKENVIRONMENTTYPEKEY.key()
			,__INNER__BLINK_STS_ENDPOINTS__.key()
			,__INNER__TABLENAME__.key()
			,__TABLENAME__.key()
			,CONNECTOR_GROUP.key()
			,CONNECTOR_PROPERTY_VERSION.key()
			,SCHEMA.key()
			,STARTTIME.key()
			,TIMEZONE.key()
			,TYPE.key()
			,__INNER__JOBNAME__.key()
			,__INNER__PROJECTNAME__.key()
			,__INNER_ZK_QUORUM__.key()
			,CONNECTOR_TYPE.key()
			,STARTTIMEMS.key()
	);
}
