
package service;

import com.google.inject.AbstractModule;
import play.libs.akka.AkkaGuiceSupport;

import service.ChannelServiceImpl;
import service.*;

/**
 * This class binds the YoutubeServiceAPI to the SearchServiceImpl
 */
public class YoutubeModule extends AbstractModule implements AkkaGuiceSupport{

    @Override
    protected final void configure() {
        bind(YoutubeServiceApi.class).to(ChannelServiceImpl.class);
        //bind(ServiceApi.class).to(SearchServiceImpl.class);
    }
}
