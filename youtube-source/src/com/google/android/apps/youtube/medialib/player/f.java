// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.player;

import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.datalib.innertube.model.media.FormatStream;
import com.google.android.apps.youtube.datalib.innertube.model.media.VideoStreamingData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.medialib.player:
//            ae, ad, MissingStreamException

public final class f
    implements ae
{

    private final h a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    public f(h h1, boolean flag, boolean flag1, boolean flag2)
    {
        this(h1, flag, flag1, flag2, false);
    }

    private f(h h1, boolean flag, boolean flag1, boolean flag2, boolean flag3)
    {
        a = (h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
        b = flag;
        c = flag1;
        d = flag2;
        e = false;
    }

    private static FormatStream a(Collection collection, int ai[])
    {
        int j = ai.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                break;
            }
            int k = ai[i];
            for (Iterator iterator = collection.iterator(); iterator.hasNext();)
            {
                FormatStream formatstream = (FormatStream)iterator.next();
                if (formatstream.getHeight() == k)
                {
                    return formatstream;
                }
            }

            i++;
        } while (true);
        return null;
    }

    private ad a(Collection collection, FormatStream formatstream, Set set, int i)
    {
        boolean flag3 = true;
        ArrayList arraylist = new ArrayList();
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            FormatStream formatstream1 = (FormatStream)collection.next();
            int j = formatstream1.getHeight();
            boolean flag;
            boolean flag1;
            boolean flag2;
            if (!b && j >= 720)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (c && j >= 360)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag2 = flag | false | flag1;
            flag = flag2;
            if (formatstream1.is3D())
            {
                if (!d)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (j != 720 && j != 360)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                flag = flag2 | flag | flag1;
            }
            if (set != null)
            {
                if (!set.contains(formatstream1.getSimpleMimeType()))
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                flag = flag1 | flag;
            }
            if (!flag)
            {
                arraylist.add(formatstream1);
            }
        } while (true);
        set = a(((Collection) (arraylist)));
        if (!d || set.size() <= 0)
        {
            set = arraylist;
        }
        if (!e || !a.h())
        {
            formatstream = null;
        }
        collection = formatstream;
        if (formatstream == null)
        {
            collection = a(((Collection) (set)), a());
        }
        formatstream = b(set);
        if (formatstream != null)
        {
            if (collection != null && collection.getHeight() > formatstream.getHeight())
            {
                if (i == 1)
                {
                    formatstream = collection;
                }
                return new ad(formatstream, collection, i, true);
            } else
            {
                return new ad(formatstream, formatstream, i, false);
            }
        }
        formatstream = a(((Collection) (set)), a(((FormatStream) (collection))));
        if (formatstream == null && collection == null)
        {
            if (set.isEmpty())
            {
                throw new MissingStreamException();
            }
            formatstream = (FormatStream)set.iterator().next();
        }
        if (formatstream == null)
        {
            formatstream = collection;
        } else
        if (collection == null)
        {
            collection = formatstream;
        } else
        {
            set = formatstream;
            formatstream = collection;
            collection = set;
        }
        if (i == 1)
        {
            set = formatstream;
        } else
        {
            set = collection;
        }
        if (formatstream == collection)
        {
            flag3 = false;
        }
        return new ad(set, formatstream, i, flag3);
    }

    private static List a(Collection collection)
    {
        ArrayList arraylist = new ArrayList();
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            FormatStream formatstream = (FormatStream)collection.next();
            if (formatstream.is3D())
            {
                collection.remove();
                arraylist.add(formatstream);
            }
        } while (true);
        return arraylist;
    }

    private int[] a()
    {
        if (a.h())
        {
            return (new int[] {
                720, 480, 405, 360
            });
        } else
        {
            return (new int[] {
                360
            });
        }
    }

    private int[] a(FormatStream formatstream)
    {
        boolean flag;
        if (formatstream != null && formatstream.getHeight() == 360)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (a.h())
        {
            if (flag)
            {
                return (new int[] {
                    240, 144
                });
            } else
            {
                return (new int[] {
                    360, 240, 144
                });
            }
        }
        if (a.e())
        {
            if (flag)
            {
                return (new int[] {
                    144, 240
                });
            } else
            {
                return (new int[] {
                    144, 240, 360
                });
            }
        }
        if (flag)
        {
            return (new int[] {
                240, 144
            });
        } else
        {
            return (new int[] {
                240, 144, 360
            });
        }
    }

    private static FormatStream b(Collection collection)
    {
        for (collection = collection.iterator(); collection.hasNext();)
        {
            FormatStream formatstream = (FormatStream)collection.next();
            if (formatstream.isLocal())
            {
                return formatstream;
            }
        }

        return null;
    }

    public final int a(int ai[], int i)
    {
        int ai1[];
        int k;
        if (i == 1)
        {
            ai1 = a();
        } else
        {
            ai1 = a(((FormatStream) (null)));
        }
        k = ai1.length;
        for (i = 0; i < k; i++)
        {
            int l = ai1[i];
            int i1 = ai.length;
            for (int j = 0; j < i1; j++)
            {
                if (ai[j] == l)
                {
                    return l;
                }
            }

        }

        return 0;
    }

    public final ad a(VideoStreamingData videostreamingdata, Set set, int i)
    {
        FormatStream formatstream = videostreamingdata.getHlsStream();
        if (videostreamingdata.isLive())
        {
            if (formatstream == null)
            {
                throw new MissingStreamException();
            } else
            {
                return new ad(formatstream, formatstream, i, false);
            }
        } else
        {
            return a(((Collection) (videostreamingdata.getProgressiveFormatStreams())), formatstream, set, i);
        }
    }

    public final ad a(Collection collection, Set set, int i)
    {
        return a(collection, null, set, i);
    }
}
