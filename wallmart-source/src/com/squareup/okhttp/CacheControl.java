// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.http.HeaderParser;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.squareup.okhttp:
//            Headers

public final class CacheControl
{
    public static final class Builder
    {

        int maxAgeSeconds;
        int maxStaleSeconds;
        int minFreshSeconds;
        boolean noCache;
        boolean noStore;
        boolean noTransform;
        boolean onlyIfCached;

        public CacheControl build()
        {
            return new CacheControl(this);
        }

        public Builder maxAge(int i, TimeUnit timeunit)
        {
            if (i < 0)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("maxAge < 0: ").append(i).toString());
            }
            long l = timeunit.toSeconds(i);
            if (l > 0x7fffffffL)
            {
                i = 0x7fffffff;
            } else
            {
                i = (int)l;
            }
            maxAgeSeconds = i;
            return this;
        }

        public Builder maxStale(int i, TimeUnit timeunit)
        {
            if (i < 0)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("maxStale < 0: ").append(i).toString());
            }
            long l = timeunit.toSeconds(i);
            if (l > 0x7fffffffL)
            {
                i = 0x7fffffff;
            } else
            {
                i = (int)l;
            }
            maxStaleSeconds = i;
            return this;
        }

        public Builder minFresh(int i, TimeUnit timeunit)
        {
            if (i < 0)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("minFresh < 0: ").append(i).toString());
            }
            long l = timeunit.toSeconds(i);
            if (l > 0x7fffffffL)
            {
                i = 0x7fffffff;
            } else
            {
                i = (int)l;
            }
            minFreshSeconds = i;
            return this;
        }

        public Builder noCache()
        {
            noCache = true;
            return this;
        }

        public Builder noStore()
        {
            noStore = true;
            return this;
        }

        public Builder noTransform()
        {
            noTransform = true;
            return this;
        }

        public Builder onlyIfCached()
        {
            onlyIfCached = true;
            return this;
        }

        public Builder()
        {
            maxAgeSeconds = -1;
            maxStaleSeconds = -1;
            minFreshSeconds = -1;
        }
    }


    public static final CacheControl FORCE_CACHE;
    public static final CacheControl FORCE_NETWORK = (new Builder()).noCache().build();
    String headerValue;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;

    private CacheControl(Builder builder)
    {
        noCache = builder.noCache;
        noStore = builder.noStore;
        maxAgeSeconds = builder.maxAgeSeconds;
        sMaxAgeSeconds = -1;
        isPrivate = false;
        isPublic = false;
        mustRevalidate = false;
        maxStaleSeconds = builder.maxStaleSeconds;
        minFreshSeconds = builder.minFreshSeconds;
        onlyIfCached = builder.onlyIfCached;
        noTransform = builder.noTransform;
    }


    private CacheControl(boolean flag, boolean flag1, int i, int j, boolean flag2, boolean flag3, boolean flag4, 
            int k, int l, boolean flag5, boolean flag6, String s)
    {
        noCache = flag;
        noStore = flag1;
        maxAgeSeconds = i;
        sMaxAgeSeconds = j;
        isPrivate = flag2;
        isPublic = flag3;
        mustRevalidate = flag4;
        maxStaleSeconds = k;
        minFreshSeconds = l;
        onlyIfCached = flag5;
        noTransform = flag6;
        headerValue = s;
    }

    private String headerValue()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (noCache)
        {
            stringbuilder.append("no-cache, ");
        }
        if (noStore)
        {
            stringbuilder.append("no-store, ");
        }
        if (maxAgeSeconds != -1)
        {
            stringbuilder.append("max-age=").append(maxAgeSeconds).append(", ");
        }
        if (sMaxAgeSeconds != -1)
        {
            stringbuilder.append("s-maxage=").append(sMaxAgeSeconds).append(", ");
        }
        if (isPrivate)
        {
            stringbuilder.append("private, ");
        }
        if (isPublic)
        {
            stringbuilder.append("public, ");
        }
        if (mustRevalidate)
        {
            stringbuilder.append("must-revalidate, ");
        }
        if (maxStaleSeconds != -1)
        {
            stringbuilder.append("max-stale=").append(maxStaleSeconds).append(", ");
        }
        if (minFreshSeconds != -1)
        {
            stringbuilder.append("min-fresh=").append(minFreshSeconds).append(", ");
        }
        if (onlyIfCached)
        {
            stringbuilder.append("only-if-cached, ");
        }
        if (noTransform)
        {
            stringbuilder.append("no-transform, ");
        }
        if (stringbuilder.length() == 0)
        {
            return "";
        } else
        {
            stringbuilder.delete(stringbuilder.length() - 2, stringbuilder.length());
            return stringbuilder.toString();
        }
    }

    public static CacheControl parse(Headers headers)
    {
        String s;
        boolean flag;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k2;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        boolean flag6;
        boolean flag7;
        boolean flag8;
        flag8 = false;
        flag7 = false;
        i1 = -1;
        l = -1;
        flag6 = false;
        flag5 = false;
        flag4 = false;
        k = -1;
        j = -1;
        flag3 = false;
        flag2 = false;
        flag = true;
        s = null;
        j1 = 0;
        k2 = headers.size();
_L1:
        String s1;
        int i;
        int l1;
        int i2;
        int j2;
        boolean flag1;
        boolean flag9;
        boolean flag10;
        boolean flag11;
        boolean flag12;
        boolean flag13;
        boolean flag14;
        boolean flag15;
        if (j1 < k2)
        {
            String s3 = headers.name(j1);
            String s2 = headers.value(j1);
            int k1;
            if (s3.equalsIgnoreCase("Cache-Control"))
            {
                if (s != null)
                {
                    flag = false;
                } else
                {
                    s = s2;
                }
            } else
            {
                flag9 = flag8;
                flag10 = flag7;
                i = i1;
                l1 = l;
                flag11 = flag6;
                flag12 = flag5;
                flag13 = flag4;
                i2 = k;
                j2 = j;
                flag14 = flag3;
                flag15 = flag2;
                s1 = s;
                flag1 = flag;
                if (!s3.equalsIgnoreCase("Pragma"))
                {
                    break MISSING_BLOCK_LABEL_611;
                }
                flag = false;
            }
            k1 = 0;
            do
            {
                flag9 = flag8;
                flag10 = flag7;
                i = i1;
                l1 = l;
                flag11 = flag6;
                flag12 = flag5;
                flag13 = flag4;
                i2 = k;
                j2 = j;
                flag14 = flag3;
                flag15 = flag2;
                s1 = s;
                flag1 = flag;
                if (k1 >= s2.length())
                {
                    break;
                }
                i = HeaderParser.skipUntil(s2, k1, "=,;");
                s3 = s2.substring(k1, i).trim();
                if (i == s2.length() || s2.charAt(i) == ',' || s2.charAt(i) == ';')
                {
                    i++;
                    s1 = null;
                } else
                {
                    k1 = HeaderParser.skipWhitespace(s2, i + 1);
                    if (k1 < s2.length() && s2.charAt(k1) == '"')
                    {
                        i = k1 + 1;
                        k1 = HeaderParser.skipUntil(s2, i, "\"");
                        s1 = s2.substring(i, k1);
                        i = k1 + 1;
                    } else
                    {
                        i = HeaderParser.skipUntil(s2, k1, ",;");
                        s1 = s2.substring(k1, i).trim();
                    }
                }
                if ("no-cache".equalsIgnoreCase(s3))
                {
                    flag8 = true;
                    k1 = i;
                } else
                if ("no-store".equalsIgnoreCase(s3))
                {
                    flag7 = true;
                    k1 = i;
                } else
                if ("max-age".equalsIgnoreCase(s3))
                {
                    i1 = HeaderParser.parseSeconds(s1, -1);
                    k1 = i;
                } else
                if ("s-maxage".equalsIgnoreCase(s3))
                {
                    l = HeaderParser.parseSeconds(s1, -1);
                    k1 = i;
                } else
                if ("private".equalsIgnoreCase(s3))
                {
                    flag6 = true;
                    k1 = i;
                } else
                if ("public".equalsIgnoreCase(s3))
                {
                    flag5 = true;
                    k1 = i;
                } else
                if ("must-revalidate".equalsIgnoreCase(s3))
                {
                    flag4 = true;
                    k1 = i;
                } else
                if ("max-stale".equalsIgnoreCase(s3))
                {
                    k = HeaderParser.parseSeconds(s1, 0x7fffffff);
                    k1 = i;
                } else
                if ("min-fresh".equalsIgnoreCase(s3))
                {
                    j = HeaderParser.parseSeconds(s1, -1);
                    k1 = i;
                } else
                if ("only-if-cached".equalsIgnoreCase(s3))
                {
                    flag3 = true;
                    k1 = i;
                } else
                {
                    k1 = i;
                    if ("no-transform".equalsIgnoreCase(s3))
                    {
                        flag2 = true;
                        k1 = i;
                    }
                }
            } while (true);
            break MISSING_BLOCK_LABEL_611;
        } else
        {
            if (!flag)
            {
                s = null;
            }
            return new CacheControl(flag8, flag7, i1, l, flag6, flag5, flag4, k, j, flag3, flag2, s);
        }
        j1++;
        flag8 = flag9;
        flag7 = flag10;
        i1 = i;
        l = l1;
        flag6 = flag11;
        flag5 = flag12;
        flag4 = flag13;
        k = i2;
        j = j2;
        flag3 = flag14;
        flag2 = flag15;
        s = s1;
        flag = flag1;
          goto _L1
    }

    public boolean isPrivate()
    {
        return isPrivate;
    }

    public boolean isPublic()
    {
        return isPublic;
    }

    public int maxAgeSeconds()
    {
        return maxAgeSeconds;
    }

    public int maxStaleSeconds()
    {
        return maxStaleSeconds;
    }

    public int minFreshSeconds()
    {
        return minFreshSeconds;
    }

    public boolean mustRevalidate()
    {
        return mustRevalidate;
    }

    public boolean noCache()
    {
        return noCache;
    }

    public boolean noStore()
    {
        return noStore;
    }

    public boolean noTransform()
    {
        return noTransform;
    }

    public boolean onlyIfCached()
    {
        return onlyIfCached;
    }

    public int sMaxAgeSeconds()
    {
        return sMaxAgeSeconds;
    }

    public String toString()
    {
        String s = headerValue;
        if (s != null)
        {
            return s;
        } else
        {
            String s1 = headerValue();
            headerValue = s1;
            return s1;
        }
    }

    static 
    {
        FORCE_CACHE = (new Builder()).onlyIfCached().maxStale(0x7fffffff, TimeUnit.SECONDS).build();
    }
}
