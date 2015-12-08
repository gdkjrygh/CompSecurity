// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.formats;


public final class NativeAdOptions
{
    public static final class Builder
    {

        private boolean zznS;
        private int zznT;
        private boolean zznU;

        static boolean zza(Builder builder)
        {
            return builder.zznS;
        }

        static int zzb(Builder builder)
        {
            return builder.zznT;
        }

        static boolean zzc(Builder builder)
        {
            return builder.zznU;
        }

        public NativeAdOptions build()
        {
            return new NativeAdOptions(this);
        }

        public Builder setImageOrientation(int i)
        {
            zznT = i;
            return this;
        }

        public Builder setRequestMultipleImages(boolean flag)
        {
            zznU = flag;
            return this;
        }

        public Builder setReturnUrlsForImageAssets(boolean flag)
        {
            zznS = flag;
            return this;
        }

        public Builder()
        {
            zznS = false;
            zznT = 0;
            zznU = false;
        }
    }


    public static final int ORIENTATION_ANY = 0;
    public static final int ORIENTATION_LANDSCAPE = 2;
    public static final int ORIENTATION_PORTRAIT = 1;
    private final boolean zznS;
    private final int zznT;
    private final boolean zznU;

    private NativeAdOptions(Builder builder)
    {
        zznS = Builder.zza(builder);
        zznT = Builder.zzb(builder);
        zznU = Builder.zzc(builder);
    }


    public int getImageOrientation()
    {
        return zznT;
    }

    public boolean shouldRequestMultipleImages()
    {
        return zznU;
    }

    public boolean shouldReturnUrlsForImageAssets()
    {
        return zznS;
    }
}
