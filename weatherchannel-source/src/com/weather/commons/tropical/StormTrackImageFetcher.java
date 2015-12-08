// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.tropical;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.maps.android.PolyUtil;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.weather.util.geometry.LatLng;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.maps.GoogleStaticMapsUrl;
import com.weather.util.maps.MapUtil;
import com.weather.util.ui.Dimension;
import java.util.List;

// Referenced classes of package com.weather.commons.tropical:
//            StormPosition, StormData

public class StormTrackImageFetcher
{
    public static class ImageRequestParameters
    {

        final int imageHeight;
        final int imageWidth;
        final int scale;

        public boolean equals(Object obj)
        {
            boolean flag2 = true;
            boolean flag3 = false;
            boolean flag;
            if (this == obj)
            {
                flag = true;
            } else
            {
                flag = flag3;
                if (obj != null)
                {
                    flag = flag3;
                    if (getClass() == obj.getClass())
                    {
                        obj = (ImageRequestParameters)obj;
                        flag = flag3;
                        if (imageWidth == ((ImageRequestParameters) (obj)).imageWidth)
                        {
                            flag = flag3;
                            if (imageHeight == ((ImageRequestParameters) (obj)).imageHeight)
                            {
                                boolean flag1;
                                if (scale == ((ImageRequestParameters) (obj)).scale)
                                {
                                    flag1 = flag2;
                                } else
                                {
                                    flag1 = false;
                                }
                                return flag1;
                            }
                        }
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return (imageWidth * 31 + imageHeight) * 31 + scale;
        }

        public String toString()
        {
            return (new StringBuilder()).append("ImageRequestParameters{imageWidth=").append(imageWidth).append(", imageHeight=").append(imageHeight).append(", scale=").append(scale).append('}').toString();
        }

        public ImageRequestParameters(Dimension dimension, int i)
        {
            dimension = MapUtil.clip(dimension, i);
            imageWidth = dimension.getWidth();
            imageHeight = dimension.getHeight();
            scale = i;
        }
    }

    private static class NonCurrentTypeFilter
        implements Predicate
    {

        private final StormData.StormType typeToInclude;

        public boolean apply(StormPosition stormposition)
        {
            return stormposition == null || typeToInclude == stormposition.getStormType() && stormposition.getStatus() != StormPosition.Status.CURRENT;
        }

        public volatile boolean apply(Object obj)
        {
            return apply((StormPosition)obj);
        }

        NonCurrentTypeFilter(StormData.StormType stormtype)
        {
            typeToInclude = stormtype;
        }
    }

    private static class StormPositionToMapLocation
        implements Function
    {

        public com.weather.util.maps.GoogleStaticMapsUrl.MapLocation apply(StormPosition stormposition)
        {
            if (stormposition == null)
            {
                return null;
            } else
            {
                return new com.weather.util.maps.GoogleStaticMapsUrl.MapLocation(Double.valueOf(stormposition.getLatLng().latitude), Double.valueOf(stormposition.getLatLng().longitude));
            }
        }

        public volatile Object apply(Object obj)
        {
            return apply((StormPosition)obj);
        }

        private StormPositionToMapLocation()
        {
        }

    }


    private static final com.weather.util.maps.GoogleStaticMapsUrl.MapLocation NON_ACTIVE_CENTER = new com.weather.util.maps.GoogleStaticMapsUrl.MapLocation(Double.valueOf(39.5D), Double.valueOf(-98.349999999999994D));
    private static final String TAG = "StormTrackImageFetcher";
    private final Context context;
    private final Picasso picasso;

    public StormTrackImageFetcher(Picasso picasso1, Context context1)
    {
        picasso = (Picasso)Preconditions.checkNotNull(picasso1);
        context = (Context)Preconditions.checkNotNull(context1);
    }

    private void addNonCurrentIcon(List list, GoogleStaticMapsUrl googlestaticmapsurl, StormData.StormType stormtype, String s)
    {
        list = ImmutableList.copyOf(FluentIterable.from(list).filter(new NonCurrentTypeFilter(stormtype)).transform(new StormPositionToMapLocation()));
        if (!list.isEmpty())
        {
            googlestaticmapsurl.addIcon(new com.weather.util.maps.GoogleStaticMapsUrl.MapIcon(s, com.weather.util.maps.GoogleStaticMapsUrl.MapIcon.Decoration.NONE, list));
        }
    }

    private List filterStormPosition(List list)
    {
        com.google.common.collect.ImmutableList.Builder builder = ImmutableList.builder();
        int k = list.size() - 1;
        int i = 0;
        while (k >= 0) 
        {
            StormPosition stormposition = (StormPosition)list.get(k);
            int j;
            if (stormposition.getStatus() == StormPosition.Status.PAST)
            {
                int l = i + 1;
                j = l;
                if (i < 4)
                {
                    builder.add(stormposition);
                    j = l;
                }
            } else
            {
                builder.add(stormposition);
                j = i;
            }
            k--;
            i = j;
        }
        return builder.build().reverse();
    }

    private String getUrlForCurrentPosition(StormData.StormType stormtype)
    {
        static class _cls3
        {

            static final int $SwitchMap$com$weather$commons$tropical$StormData$StormType[];

            static 
            {
                $SwitchMap$com$weather$commons$tropical$StormData$StormType = new int[StormData.StormType.values().length];
                try
                {
                    $SwitchMap$com$weather$commons$tropical$StormData$StormType[StormData.StormType.TROPICAL_DEPRESSION.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$weather$commons$tropical$StormData$StormType[StormData.StormType.TROPICAL_STORM.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$weather$commons$tropical$StormData$StormType[StormData.StormType.HURRICANE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls3..SwitchMap.com.weather.commons.tropical.StormData.StormType[stormtype.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown storm type: ").append(stormtype).toString());

        case 1: // '\001'
            return context.getString(com.weather.commons.R.string.tropical_depression_current_image);

        case 2: // '\002'
            return context.getString(com.weather.commons.R.string.tropical_storm_current_image);

        case 3: // '\003'
            return context.getString(com.weather.commons.R.string.hurricane_current_image);
        }
    }

    public void fetch(ImageView imageview, ImageRequestParameters imagerequestparameters, StormData stormdata)
    {
        imagerequestparameters = GoogleStaticMapsUrl.createWithAutoPosition(imagerequestparameters.imageWidth, imagerequestparameters.imageHeight, imagerequestparameters.scale);
        imagerequestparameters.setMapType("satellite");
        Object obj = context.getResources();
        if (stormdata.getStormCone().size() >= 3)
        {
            imagerequestparameters.addPath(new com.weather.util.maps.GoogleStaticMapsUrl.MapPath(GoogleStaticMapsUrl.convertColorToRGBA(((Resources) (obj)).getColor(com.weather.commons.R.color.storm_cone_border_color)), GoogleStaticMapsUrl.convertColorToRGBA(((Resources) (obj)).getColor(com.weather.commons.R.color.storm_cone_fill_color)), 5, PolyUtil.encode(Lists.transform(stormdata.getStormCone(), new Function() {

                final StormTrackImageFetcher this$0;

                public com.google.android.gms.maps.model.LatLng apply(LatLng latlng)
                {
                    if (latlng == null)
                    {
                        return null;
                    } else
                    {
                        return new com.google.android.gms.maps.model.LatLng(latlng.latitude, latlng.longitude);
                    }
                }

                public volatile Object apply(Object obj1)
                {
                    return apply((LatLng)obj1);
                }

            
            {
                this$0 = StormTrackImageFetcher.this;
                super();
            }
            }))));
        }
        List list = filterStormPosition(stormdata.getStormTrack());
        if (list.size() > 1)
        {
            imagerequestparameters.addPath(new com.weather.util.maps.GoogleStaticMapsUrl.MapPath(GoogleStaticMapsUrl.convertColorToRGBA(((Resources) (obj)).getColor(com.weather.commons.R.color.storm_track_line_color)), null, ((Resources) (obj)).getDimensionPixelOffset(com.weather.commons.R.dimen.storm_track_line_width), PolyUtil.encode(Lists.transform(list, new Function() {

                final StormTrackImageFetcher this$0;

                public com.google.android.gms.maps.model.LatLng apply(StormPosition stormposition)
                {
                    if (stormposition == null)
                    {
                        return null;
                    } else
                    {
                        return new com.google.android.gms.maps.model.LatLng(stormposition.getLatLng().latitude, stormposition.getLatLng().longitude);
                    }
                }

                public volatile Object apply(Object obj1)
                {
                    return apply((StormPosition)obj1);
                }

            
            {
                this$0 = StormTrackImageFetcher.this;
                super();
            }
            }))));
        }
        obj = stormdata.getCurrentPosition();
        imagerequestparameters.addIcon(new com.weather.util.maps.GoogleStaticMapsUrl.MapIcon(getUrlForCurrentPosition(stormdata.getStormType()), com.weather.util.maps.GoogleStaticMapsUrl.MapIcon.Decoration.NONE, new com.weather.util.maps.GoogleStaticMapsUrl.MapLocation(Double.valueOf(((LatLng) (obj)).latitude), Double.valueOf(((LatLng) (obj)).longitude))));
        addNonCurrentIcon(list, imagerequestparameters, StormData.StormType.TROPICAL_DEPRESSION, context.getString(com.weather.commons.R.string.tropical_depression_future_image));
        addNonCurrentIcon(list, imagerequestparameters, StormData.StormType.TROPICAL_STORM, context.getString(com.weather.commons.R.string.tropical_storm_future_image));
        addNonCurrentIcon(list, imagerequestparameters, StormData.StormType.HURRICANE, context.getString(com.weather.commons.R.string.hurricane_future_image));
        imagerequestparameters = imagerequestparameters.get();
        LogUtil.d("StormTrackImageFetcher", LoggingMetaTags.TWC_BITMAPS, "Storm Track URL is %s with size of %d, valid=%s", new Object[] {
            imagerequestparameters, Integer.valueOf(imagerequestparameters.length()), Boolean.valueOf(URLUtil.isValidUrl(imagerequestparameters))
        });
        LogUtil.d("StormTrackImageFetcher", LoggingMetaTags.TWC_BITMAPS, "uri = %s", new Object[] {
            Uri.parse(imagerequestparameters)
        });
        picasso.load(imagerequestparameters).error(com.weather.commons.R.drawable.news_video_default).skipMemoryCache().into(imageview);
    }

    public void fetchWithNoStorm(ImageView imageview, ImageRequestParameters imagerequestparameters)
    {
        imagerequestparameters = GoogleStaticMapsUrl.createWithCenter(NON_ACTIVE_CENTER, 2, imagerequestparameters.imageWidth, imagerequestparameters.imageHeight, imagerequestparameters.scale);
        imagerequestparameters.setMapType("satellite");
        picasso.load(imagerequestparameters.get()).error(com.weather.commons.R.drawable.news_video_default).skipMemoryCache().into(imageview);
    }

}
