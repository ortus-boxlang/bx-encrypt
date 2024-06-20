package ortus.boxlang.modules.encrypt.interceptors;

import org.slf4j.LoggerFactory;

import ortus.boxlang.runtime.events.BaseInterceptor;
import ortus.boxlang.runtime.events.InterceptionPoint;
import ortus.boxlang.runtime.types.IStruct;

public class EncryptionRequest extends BaseInterceptor {

	/**
	 * This method is called by the BoxLang runtime to configure the interceptor
	 * with a Struct of properties
	 *
	 * @param properties The properties to configure the interceptor with (if any)
	 */
	@Override
	public void configure( IStruct properties ) {
		this.properties	= properties;
		this.logger		= LoggerFactory.getLogger( this.getClass() );
	}

	/**
	 * Add your events below with an @interceptionPoint
	 */
	@InterceptionPoint
	public void onEncryptionRequest( IStruct data ) {
		logger.info( "Encryption request received: " + data.asString() );
	}

}
