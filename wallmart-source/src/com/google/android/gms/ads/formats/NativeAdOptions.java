// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.formats;


public final class NativeAdOptions
{
    public static final class Builder
    {

        private boolean zznV;
        private int zznW;
        private boolean zznX;

        static boolean zza(Builder builder)
        {
            return builder.zznV;
        }

        static int zzb(Builder builder)
        {
            return builder.zznW;
        }

        static boolean zzc(Builder builder)
        {
            return builder.zznX;
        }

        public NativeAdOptions build()
        {
            return new NativeAdOptions(this);
        }

        public Builder setImageOrientation(int i)
        {
            zznW = i;
            return this;
        }

        public Builder setRequestMultipleImages(boolean flag)
        {
            zznX = flag;
            return this;
        }

        public Builder setReturnUrlsForImageAssets(boolean flag)
        {
            zznV = flag;
            return this;
        }

        public Builder()
        {
            zznV = false;
            zznW = 0;
            zznX = false;
        }
    }


    public static final int ORIENTATION_ANY = 0;
    public static final int ORIENTATION_LANDSCAPE = 2;
    public static final int ORIENTATION_PORTRAIT = 1;
    private final boolean zznV;
    private final int zznW;
    private final boolean zznX;

    private NativeAdOptions(Builder builder)
    {
        zznV = Builder.zza(builder);
        zznW = Builder.zzb(builder);
        zznX = Builder.zzc(builder);
    }


    public int getImageOrientation()
    {
        return zznW;
    }

    public boolean shouldRequestMultipleImages()
    {
        return zznX;
    }

    public boolean shouldReturnUrlsForImageAssets()
    {
        return zznV;
    }
}
