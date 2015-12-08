// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.net.Uri;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class Branding
    implements Serializable
{

    public final Uri bannerTargetUri;
    public final Uri bannerUri;
    public final Uri channelBannerMobileExtraHdUri;
    public final Uri channelBannerMobileHdUri;
    public final Uri channelBannerMobileLowUri;
    public final Uri channelBannerMobileMediumHdUri;
    public final Uri channelBannerMobileMediumUri;
    public final Uri channelBannerTabletExtraHdUri;
    public final Uri channelBannerTabletHdUri;
    public final Uri channelBannerTabletLowUri;
    public final Uri channelBannerTabletMediumUri;
    public final Uri channelBannerTvUri;
    public final String description;
    public final String featuredPlaylistId;
    public final Uri interstitialTargetUri;
    public final Uri interstitialUri;
    public final String keywords;
    public final Uri largeBannerUri;
    public final String title;
    public final Uri tvBannerUri;
    public final Uri watermarkTargetUri;
    public final Uri watermarkUri;

    public Branding(String s, String s1, String s2, Uri uri, Uri uri1, Uri uri2, Uri uri3, 
            Uri uri4, Uri uri5, Uri uri6, String s3, Uri uri7, Uri uri8, Uri uri9, 
            Uri uri10, Uri uri11, Uri uri12, Uri uri13, Uri uri14, Uri uri15, Uri uri16, 
            Uri uri17)
    {
        title = s;
        description = s1;
        keywords = s2;
        bannerUri = uri;
        largeBannerUri = uri1;
        bannerTargetUri = uri2;
        watermarkUri = uri3;
        watermarkTargetUri = uri4;
        interstitialUri = uri5;
        interstitialTargetUri = uri6;
        featuredPlaylistId = s3;
        tvBannerUri = uri7;
        channelBannerMobileLowUri = uri8;
        channelBannerMobileMediumUri = uri9;
        channelBannerMobileMediumHdUri = uri10;
        channelBannerMobileHdUri = uri11;
        channelBannerMobileExtraHdUri = uri12;
        channelBannerTabletLowUri = uri13;
        channelBannerTabletMediumUri = uri14;
        channelBannerTabletHdUri = uri15;
        channelBannerTabletExtraHdUri = uri16;
        channelBannerTvUri = uri17;
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        throw new InvalidObjectException("builder required");
    }

    private Object writeReplace()
    {
        return buildUpon();
    }

    public final Builder buildUpon()
    {
        return (new Builder()).title(title).description(description).keywords(keywords).bannerUri(bannerUri).largeBannerUri(largeBannerUri).bannerTargetUri(bannerTargetUri).watermarkUri(watermarkUri).watermarkTargetUri(watermarkTargetUri).interstitialUri(interstitialUri).interstitialTargetUri(interstitialTargetUri).featuredPlaylistId(featuredPlaylistId).tvBannerUri(tvBannerUri).channelBannerMobileLowUri(channelBannerMobileLowUri).channelBannerMobileMediumUri(channelBannerMobileMediumUri).channelBannerMobileMediumHdUri(channelBannerMobileMediumHdUri).channelBannerMobileHdUri(channelBannerMobileHdUri).channelBannerMobileExtraHdUri(channelBannerMobileExtraHdUri).channelBannerTabletLowUri(channelBannerTabletLowUri).channelBannerTabletMediumUri(channelBannerTabletMediumUri).channelBannerTabletHdUri(channelBannerTabletHdUri).channelBannerTabletExtraHdUri(channelBannerTabletExtraHdUri).channelBannerTvUri(channelBannerTvUri);
    }

    private class Builder
        implements r, Serializable
    {

        private Uri bannerTargetUri;
        private Uri bannerUri;
        private Uri channelBannerMobileExtraHdUri;
        private Uri channelBannerMobileHdUri;
        private Uri channelBannerMobileLowUri;
        private Uri channelBannerMobileMediumHdUri;
        private Uri channelBannerMobileMediumUri;
        private Uri channelBannerTabletExtraHdUri;
        private Uri channelBannerTabletHdUri;
        private Uri channelBannerTabletLowUri;
        private Uri channelBannerTabletMediumUri;
        private Uri channelBannerTvUri;
        private String description;
        private String featuredPlaylistId;
        private Uri interstitialTargetUri;
        private Uri interstitialUri;
        private String keywords;
        private Uri largeBannerUri;
        private String title;
        private Uri tvBannerUri;
        private Uri watermarkTargetUri;
        private Uri watermarkUri;

        private void readObject(ObjectInputStream objectinputstream)
        {
            title = (String)objectinputstream.readObject();
            description = (String)objectinputstream.readObject();
            keywords = (String)objectinputstream.readObject();
            bannerUri = p.a((String)objectinputstream.readObject());
            largeBannerUri = p.a((String)objectinputstream.readObject());
            bannerTargetUri = p.a((String)objectinputstream.readObject());
            watermarkUri = p.a((String)objectinputstream.readObject());
            watermarkTargetUri = p.a((String)objectinputstream.readObject());
            interstitialUri = p.a((String)objectinputstream.readObject());
            interstitialTargetUri = p.a((String)objectinputstream.readObject());
            featuredPlaylistId = (String)objectinputstream.readObject();
            tvBannerUri = p.a((String)objectinputstream.readObject());
            channelBannerMobileLowUri = p.a((String)objectinputstream.readObject());
            channelBannerMobileMediumUri = p.a((String)objectinputstream.readObject());
            channelBannerMobileMediumHdUri = p.a((String)objectinputstream.readObject());
            channelBannerMobileHdUri = p.a((String)objectinputstream.readObject());
            channelBannerMobileExtraHdUri = p.a((String)objectinputstream.readObject());
            channelBannerTabletLowUri = p.a((String)objectinputstream.readObject());
            channelBannerTabletMediumUri = p.a((String)objectinputstream.readObject());
            channelBannerTabletHdUri = p.a((String)objectinputstream.readObject());
            channelBannerTabletExtraHdUri = p.a((String)objectinputstream.readObject());
            channelBannerTvUri = p.a((String)objectinputstream.readObject());
        }

        private Object readResolve()
        {
            return build();
        }

        private void writeObject(ObjectOutputStream objectoutputstream)
        {
            objectoutputstream.writeObject(title);
            objectoutputstream.writeObject(description);
            objectoutputstream.writeObject(keywords);
            objectoutputstream.writeObject(p.a(bannerUri));
            objectoutputstream.writeObject(p.a(largeBannerUri));
            objectoutputstream.writeObject(p.a(bannerTargetUri));
            objectoutputstream.writeObject(p.a(watermarkUri));
            objectoutputstream.writeObject(p.a(watermarkTargetUri));
            objectoutputstream.writeObject(p.a(interstitialUri));
            objectoutputstream.writeObject(p.a(interstitialTargetUri));
            objectoutputstream.writeObject(featuredPlaylistId);
            objectoutputstream.writeObject(p.a(tvBannerUri));
            objectoutputstream.writeObject(p.a(channelBannerMobileLowUri));
            objectoutputstream.writeObject(p.a(channelBannerMobileMediumUri));
            objectoutputstream.writeObject(p.a(channelBannerMobileMediumHdUri));
            objectoutputstream.writeObject(p.a(channelBannerMobileHdUri));
            objectoutputstream.writeObject(p.a(channelBannerMobileExtraHdUri));
            objectoutputstream.writeObject(p.a(channelBannerTabletLowUri));
            objectoutputstream.writeObject(p.a(channelBannerTabletMediumUri));
            objectoutputstream.writeObject(p.a(channelBannerTabletHdUri));
            objectoutputstream.writeObject(p.a(channelBannerTabletExtraHdUri));
            objectoutputstream.writeObject(p.a(channelBannerTvUri));
        }

        public Builder bannerTargetUri(Uri uri)
        {
            bannerTargetUri = uri;
            return this;
        }

        public Builder bannerUri(Uri uri)
        {
            bannerUri = uri;
            return this;
        }

        public Branding build()
        {
            return new Branding(title, description, keywords, bannerUri, largeBannerUri, bannerTargetUri, watermarkUri, watermarkTargetUri, interstitialUri, interstitialTargetUri, featuredPlaylistId, tvBannerUri, channelBannerMobileLowUri, channelBannerMobileMediumUri, channelBannerMobileMediumHdUri, channelBannerMobileHdUri, channelBannerMobileExtraHdUri, channelBannerTabletLowUri, channelBannerTabletMediumUri, channelBannerTabletHdUri, channelBannerTabletExtraHdUri, channelBannerTvUri);
        }

        public volatile Object build()
        {
            return build();
        }

        public Builder channelBannerMobileExtraHdUri(Uri uri)
        {
            channelBannerMobileExtraHdUri = uri;
            return this;
        }

        public Builder channelBannerMobileHdUri(Uri uri)
        {
            channelBannerMobileHdUri = uri;
            return this;
        }

        public Builder channelBannerMobileLowUri(Uri uri)
        {
            channelBannerMobileLowUri = uri;
            return this;
        }

        public Builder channelBannerMobileMediumHdUri(Uri uri)
        {
            channelBannerMobileMediumHdUri = uri;
            return this;
        }

        public Builder channelBannerMobileMediumUri(Uri uri)
        {
            channelBannerMobileMediumUri = uri;
            return this;
        }

        public Builder channelBannerTabletExtraHdUri(Uri uri)
        {
            channelBannerTabletExtraHdUri = uri;
            return this;
        }

        public Builder channelBannerTabletHdUri(Uri uri)
        {
            channelBannerTabletHdUri = uri;
            return this;
        }

        public Builder channelBannerTabletLowUri(Uri uri)
        {
            channelBannerTabletLowUri = uri;
            return this;
        }

        public Builder channelBannerTabletMediumUri(Uri uri)
        {
            channelBannerTabletMediumUri = uri;
            return this;
        }

        public Builder channelBannerTvUri(Uri uri)
        {
            channelBannerTvUri = uri;
            return this;
        }

        public Builder description(String s)
        {
            description = s;
            return this;
        }

        public Builder featuredPlaylistId(String s)
        {
            featuredPlaylistId = s;
            return this;
        }

        public Builder interstitialTargetUri(Uri uri)
        {
            interstitialTargetUri = uri;
            return this;
        }

        public Builder interstitialUri(Uri uri)
        {
            interstitialUri = uri;
            return this;
        }

        public Builder keywords(String s)
        {
            keywords = s;
            return this;
        }

        public Builder largeBannerUri(Uri uri)
        {
            largeBannerUri = uri;
            return this;
        }

        public Builder title(String s)
        {
            title = s;
            return this;
        }

        public Builder tvBannerUri(Uri uri)
        {
            tvBannerUri = uri;
            return this;
        }

        public Builder watermarkTargetUri(Uri uri)
        {
            watermarkTargetUri = uri;
            return this;
        }

        public Builder watermarkUri(Uri uri)
        {
            watermarkUri = uri;
            return this;
        }

        public Builder()
        {
        }
    }

}
