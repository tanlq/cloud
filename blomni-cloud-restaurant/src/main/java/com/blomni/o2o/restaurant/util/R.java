
package com.blomni.o2o.restaurant.util;



public final class R {
	/**
	 * 
	 * Function : cloud常量定义<br/>
	 * Date : 2016年10月10日 下午1:33:42 <br/>
	 * 
	 * @author TANLQ
	 * @version 
	 * @since JDK 1.7
	 */
	public interface CloudConstant {
		/** UTF-8 */
		public static final String UTF8 = "UTF-8";
		/** MD5 */
		public static final String MD5 = "MD5";
		/** 返回标识 */
		public static final String RET_FLAG = "ret_flag";
		/** 返回代码 */
		public static final String RET_CODE = "ret_code";
		/** 返回消息 */
		public static final String RET_MSG = "ret_msg";
		/** 返回转接流水号*/
		public static final String REQ_MSG_ID = "reqMsgId";		
		/** 成功 */
		public static final String SUCCESS = "Y";
		/** 失败 */
		public static final String FAILURE = "W";
		/** 异常 */
		public static final String EXCEPTION = "W";
		/** 超时 */
		public static final String TIMEOUT = "T";
		/** 是 */
		public static final String YES = "Y";
		/** 否 */
		public static final String NO = "N";
		/** 开启频道 */
		public static final String OPEN_CHANNEL = "1";
		/** 关闭频道 */
		public static final String CLOSE_CHANNEL = "0";
		/** 2 */
		public static final String TWO = "2";
		/***领券渠道--云店APP**/
		public static final int CHANNELID = 30;
		/** 1 */
		public static final String ONE = "1";
		/** 3 */
		public static final String THREE = "3";
		/** 0 */
		public static final String ZERO = "0";
		/** 真 */
		public static final String TRUE = "true";
		/** 假 */
		public static final String FALSE = "false";
		/**页面错误码*/
		public static final String PAGE_ERROR_CODE="page_error_code";
		/** 登录标识*/
		public static final String LOGIN_FLAG="2";
		/** 注册标识*/
		public static final String REGISTER_FLAG="1";
		/** 日期格式 yyyy-MM-dd */
		public static final String DATE_FULL = "yyyy-MM-dd";
		/** 时间格式 yyyy-MM-dd HH:mm:ss */
		public static final String DATETIME_FULL = "yyyy-MM-dd HH:mm:ss";
		/** 日期格式（无连接符）yyyyMM */
		public static final String DATE_SHORT_MONTH = "yyyyMM";
		/** 日期格式 yyyy-MM */
		public static final String DATE_MONTH = "yyyy-MM";
		/** 日期格式（无连接符）yyyyMMdd */
		public static final String DATE_SHORT = "yyyyMMdd";
		/** 时间格式（无连接符） yyyyMMddHHmmss */
		public static final String DATETIME_SHORT = "yyyyMMddHHmmss";
	    /** 时间格式（无连接符） yyyyMMddHH */
		public static final String DATETIME_HOUR = "yyyyMMddHH";
		/** 时间格式（无连接符）HHmmss*/
		public static final String TIME_SHORT = "HHmmss";
		/** 时间格式 HH:mm:ss*/
		public static final String TIME_FULL = "HH:mm:ss";
		/** 时间格式 yyyy-MM-dd HH:mm:ss.SSS */
		public static final String DATETIME_FULL_S = "yyyy-MM-dd HH:mm:ss.SSS";
		/** 时间格式YYYYMMdd HH:mm:ss */
		public static final String DATETIME_FULL_QUICK_PAY = "yyyyMMdd HH:mm:ss";
		
		/** 时间格式MMDDhhmmss */
		public static final String DATETIME_FULL_MMDDHHMMSS = "MMddHHmmss";
		
		/** 时间格式hhmmss */
		public static final String DATETIME_FULL_HHMMSS = "hhmmss";
		
		/** 时间格式hh */
		public static final String DATETIME_FULL_HH = "HH";
		
		/** 时间格式MMDD */
		public static final String DATETIME_FULL_MMDD = "MMdd";
		
		/** 时间格式YYMM */
		public static final String DATETIME_FULL_YYMM = "yyMM";
		
		/** 时间格式DD */
		public static final String DATETIME_FULL_DD = "dd";
		
		/** 失效时间 5分钟 */
		public static final String  EFFECTIVETIME = "请在5分钟内支付";
		
		/***云店ceph统一文件上传路径**/
		public static final String FILE_UPLOAD_APP_ID="cloud";
		
		/***是否压缩**/
		public static final String FILE_UPLOAD_RESIZE="0";
		
		/***占用**/
		public static final String STATUS_OCCUPY="0";
		
		/***空闲**/
		public static final String STATUS_FREE="1";
		
		/***禁用**/
		public static final String STATUS_DISABLE="3";
		
		/***人人直播**/
		public static final String LIVE_TYPE_EVERYONE="2";
		
		/***授权直播 **/
		public static final String LIVE_TYPE_EMPOWER="1";
		
		/***ios标签**/
		public static final String IOS_STRING="ios";
		
		/***ios标签**/
		public static final String REDIS_LAST_VERSION_KEY="redisLastVersionKey";
		
		/**软件更新标题**/
		public static final String SOFTWARE_TITLE="软件更新";
		
		/**软件更新标题**/
		public static final String SOFTWARE_MSG="新的功能等待发现";
		
		/**release版本标签**/
		public static final String IOS_RELEASE_STRING="release";
		
		
		/***首次充值任务ID **/
		public static final String CLOUD_TASK_ID="10004";

		
		/** 5分钟 */
		public static final int  EFFECTIVE_TIME_ORDER = 300;
		
		/** mq成功标识*/
		public static final String MQ_SUCCESS="00100000";
		
		public static final String MD5_SIGN_KEY = "C7EF27E20F144A28A1C3F7BF3FB4E272";
		/** 好逛虚拟商户号*/
		public static final String MERID = "000090150504249";
		/** 版本*/
		public static final String VERSION = "20140728";
		/** 交易类型 0403消费撤销*/
		public static final String TRAN_TYPE_CANCEL = "0403";
		/** 交易类型 0401消费退款*/
		public static final String TRAN_TYPE_REFUND = "0401";
		/** 交易类型 0502查询*/
		public static final String TRAN_TYPE_SEARCH = "0502";
		/** 交易类型 0001线上*/
		public static final String BUSI_TYPE = "0001";
		/** 支付密钥*/
		public static final String SIGN_KEY = MD5_SIGN_KEY;
		/** 支付成功*/
		public static final String PAY_STATUS_SUCCESS = "0000";
		
		/** 人民币：CNY*/
		public static final String PAY_CNY = "CNY";
		
		/***ios凭证已验证**/
		public static final String IOS_VERIFY_FLAG_YES = "0";
		
		/***ios凭证未验证**/
		public static final String IOS_VERIFY_FLAG_NO = "1";

		public static final Integer REDIS_ACTIVE_TIME=21600;
		
		public static final String REDIS_OPENAPI_TOKEN_KEY="accessToken";
		
		public static final String REDIS_OPENAPI_TOKEN_CLOUD_KEY="ACCESS_CLOUD_TOKEN";
		
		/***人人直播字典名称**/
		public static final String  EVERYONE_LIVE_TYPE ="everyone_live_type";
		
		/***苹果支付核查在openApi中的serverName**/
		public static final String SERVER_NAME="bl.cloud.verifyReceipt";
		
		public static final String IV="1234567890123456";
		
		/**I百联推送的APPKEY**/
		public static final String BLAppKey = "dfbfd65e162195a7973e811b";
		
		/**I百联推送的密钥**/
		public static final String BLMasterSecret = "dacf92422e9151c7686bf3f8";
		
		
		/**云店推送的APPKEY**/
		public static final String cloudAppKey = "5715659109a3a67822fedf5d";
		
		/**云店推送的密钥**/
		public static final String cloudMasterSecret = "ce3e8d55cb316ed0658ad8d5";
		
		/**商户推送的APPKEY**/
		public static final String mercAppKey = "41b4a2be00c571c5edb0e1f3";
		
		/**商户推送的密钥**/
		public static final String mercMasterSecret = "a6c8404cc7dcefd76e6795e7";
		
		/**未来店推送的APPKEY**/
		public static final String futureStoreAppKey = "fd64988515824fa4de789f23";
		
		/**未来店推送的密钥**/
		public static final String futureStoreMasterSecret = "6c70921c219c1fded5f7a3a6";
		
		/**lcs的key*/
		public static final String LCSKEY="lcskey";

		/** 1 */
		public static final int one = 1;
	
		/** 0 */
		public static final int zero = 0;
		
		/** 门店资源位内容表数量 */
		public static final int storeSum = 6;
		
		/** 促销中台云店渠道id */
		public static final String COUPON_CHANNELID="30";
		
		public static final String REDIS_DYNAMICCOUNT_FEED_ID="REDIS_DYNAMICCOUNT_FEED_ID";
		
		/** -1 */
		public static final String BURDEN_ONE = "-1";

		/** Four */
		public static final String FOUR = "4";
		
		/**文件过大返回结果*/
		public static final String FILE_TO_BIG_RESULT="当前appId上传文件超出大小范围，最大值为：204800";
	}
	
	/**
	 * 
	 * Function : cloud错误定义<br/>
	 * Date : 2016年6月23日 下午1:34:59 <br/>
	 * 
	 * @author TANLQk
	 * @version DictConst
	 * @since JDK 1.7
	 */
	public enum CloudErrorEnum {
		/**操作数据库发生异常*/
		ERROR_DATABASE("10110418", "操作数据库发生异常"),
		/**主建列不能为空*/
		ERROR_PRIMERKEYNULL("10110419","主建列不能为空"),
		/**对象不能为空*/
		ERROR_OBJECTNULL("10110420","对象不能为空"),
		/**网络连接超时*/
		ERROR_TIMEOUT("10110418", "网络连接超时"),
		;
		private String value;

		private String label;

		private CloudErrorEnum(String value, String label) {
			this.value = value;
			this.label = label;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getLabel() {
			return label;
		}

		public void setLabel(String label) {
			this.label = label;
		}
	}
	
	/**
	 * 
	 * Function : 云店返回码定义<br/>
	 * Date : 2016年6月23日 下午1:34:59 <br/>
	 *    APP 用的是编码的后四位
	 * @author TANLQ
	 * @version 
	 * @since JDK 1.7
	 */
	public enum ReturnCodeEnum {	
		/** 成功*/
		code_success("00100000", "操作成功"), 
		/**登录或注册失败*/
		code_loginfail("00200000", "登录或注册失败"), 
		/**获取验证码失败*/
		code_CodeMessagefail("00300000", "获取验证码失败"), 
		/**json解析失败*/
		code_jsonfail("00400000", "json解析失败"), 
		
		/**参数不能为空*/
		code_praramnotnull("00600000", "参数不能为空"),
		
		/**入参异常**/
		code_param("00900000","入参不完整"),
		
		/**缺少请求信息*/
		code_req_msg("00810000", "缺少请求参数"),
		
		/**结果集查询为空*/
		code_result("00810002", "结果集查询为空"),
		
		/**上传文件失败**/
		code_upload_file_errer("00999012","上传文件失败"),
		
		/**文件过大失败**/
		code_file_to_big_error("01000113","文件过大"),
		;

		private String value;

		private String label;

		private ReturnCodeEnum(String value, String label) {
			this.value = value;
			this.label = label;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getLabel() {
			return label;
		}

		public void setLabel(String label) {
			this.label = label;
		}
	}
	
	public enum CloudPushTypeEnum {
		/**JPush 推送*/
		JPUSH("1", "JPUSH"),
		;
		private String value;

		private String label;

		private CloudPushTypeEnum(String value, String label) {
			this.value = value;
			this.label = label;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getLabel() {
			return label;
		}

		public void setLabel(String label) {
			this.label = label;
		}
	}
	
	public enum CloudMemberTypeEnum {
		/**百联用户*/
		BAILIAN("1", "百联用户"),
		;
		private String value;

		private String label;

		private CloudMemberTypeEnum(String value, String label) {
			this.value = value;
			this.label = label;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getLabel() {
			return label;
		}

		public void setLabel(String label) {
			this.label = label;
		}
	}
	public enum CloudFileUploadTypeEnum {
		/**ceph*/
		CEPH("1", "ceph"),
		;
		private String value;

		private String label;

		private CloudFileUploadTypeEnum(String value, String label) {
			this.value = value;
			this.label = label;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getLabel() {
			return label;
		}

		public void setLabel(String label) {
			this.label = label;
		}
	}
}
