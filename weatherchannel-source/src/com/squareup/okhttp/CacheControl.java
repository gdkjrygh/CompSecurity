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
        isPublic = false;
        mustRevalidate = false;
        maxStaleSeconds = builder.maxStaleSeconds;
        minFreshSeconds = builder.minFreshSeconds;
        onlyIfCached = builder.onlyIfCached;
        noTransform = builder.noTransform;
    }


    private CacheControl(boolean flag, boolean flag1, int i, int j, boolean flag2, boolean flag3, int k, 
            int l, boolean flag4, boolean flag5)
    {
        noCache = flag;
        noStore = flag1;
        maxAgeSeconds = i;
        sMaxAgeSeconds = j;
        isPublic = flag2;
        mustRevalidate = flag3;
        maxStaleSeconds = k;
        minFreshSeconds = l;
        onlyIfCached = flag4;
        noTransform = flag5;
    }

    public static CacheControl parse(Headers headers)
    {
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l2;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        flag5 = false;
        flag4 = false;
        j1 = -1;
        i1 = -1;
        flag3 = false;
        flag2 = false;
        l = -1;
        k = -1;
        flag1 = false;
        flag = false;
        k1 = 0;
        l2 = headers.size();
_L2:
        int i;
        int i2;
        int j2;
        int k2;
        boolean flag6;
        boolean flag7;
        boolean flag8;
        boolean flag9;
        boolean flag10;
        boolean flag11;
        if (k1 >= l2)
        {
            break MISSING_BLOCK_LABEL_583;
        }
        if (headers.name(k1).equalsIgnoreCase("Cache-Control") || headers.name(k1).equalsIgnoreCase("Pragma"))
        {
            break; /* Loop/switch isn't completed */
        }
        flag6 = flag;
        flag7 = flag1;
        i = k;
        i2 = l;
        flag8 = flag2;
        flag9 = flag3;
        j2 = i1;
        k2 = j1;
        flag10 = flag4;
        flag11 = flag5;
_L4:
        k1++;
        flag5 = flag11;
        flag4 = flag10;
        j1 = k2;
        i1 = j2;
        flag3 = flag9;
        flag2 = flag8;
        l = i2;
        k = i;
        flag1 = flag7;
        flag = flag6;
        if (true) goto _L2; else goto _L1
_L1:
        String s1;
        int l1;
        s1 = headers.value(k1);
        l1 = 0;
_L5:
        flag11 = flag5;
        flag10 = flag4;
        k2 = j1;
        j2 = i1;
        flag9 = flag3;
        flag8 = flag2;
        i2 = l;
        i = k;
        flag7 = flag1;
        flag6 = flag;
        if (l1 >= s1.length()) goto _L4; else goto _L3
_L3:
        int j = HeaderParser.skipUntil(s1, l1, "=,;");
        String s2 = s1.substring(l1, j).trim();
        String s;
        if (j == s1.length() || s1.charAt(j) == ',' || s1.charAt(j) == ';')
        {
            j++;
            s = null;
        } else
        {
            l1 = HeaderParser.skipWhitespace(s1, j + 1);
            if (l1 < s1.length() && s1.charAt(l1) == '"')
            {
                j = l1 + 1;
                l1 = HeaderParser.skipUntil(s1, j, "\"");
                s = s1.substring(j, l1);
                j = l1 + 1;
            } else
            {
                j = HeaderParser.skipUntil(s1, l1, ",;");
                s = s1.substring(l1, j).trim();
            }
        }
        if ("no-cache".equalsIgnoreCase(s2))
        {
            flag5 = true;
            l1 = j;
        } else
        if ("no-store".equalsIgnoreCase(s2))
        {
            flag4 = true;
            l1 = j;
        } else
        if ("max-age".equalsIgnoreCase(s2))
        {
            j1 = HeaderParser.parseSeconds(s, -1);
            l1 = j;
        } else
        if ("s-maxage".equalsIgnoreCase(s2))
        {
            i1 = HeaderParser.parseSeconds(s, -1);
            l1 = j;
        } else
        if ("public".equalsIgnoreCase(s2))
        {
            flag3 = true;
            l1 = j;
        } else
        if ("must-revalidate".equalsIgnoreCase(s2))
        {
            flag2 = true;
            l1 = j;
        } else
        if ("max-stale".equalsIgnoreCase(s2))
        {
            l = HeaderParser.parseSeconds(s, 0x7fffffff);
            l1 = j;
        } else
        if ("min-fresh".equalsIgnoreCase(s2))
        {
            k = HeaderParser.parseSeconds(s, -1);
            l1 = j;
        } else
        if ("only-if-cached".equalsIgnoreCase(s2))
        {
            flag1 = true;
            l1 = j;
        } else
        {
            l1 = j;
            if ("no-transform".equalsIgnoreCase(s2))
            {
                flag = true;
                l1 = j;
            }
        }
          goto _L5
          goto _L4
        return new CacheControl(flag5, flag4, j1, i1, flag3, flag2, l, k, flag1, flag);
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

    static 
    {
        FORCE_CACHE = (new Builder()).onlyIfCached().maxStale(0x7fffffff, TimeUnit.SECONDS).build();
    }
}
