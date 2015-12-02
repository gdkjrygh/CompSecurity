// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.Playlist;
import com.ubercab.client.core.model.TunesProvider;
import com.ubercab.client.core.network.TunesApi;
import java.util.Map;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class dkw
    implements dkv
{

    private final TunesApi a;
    private final cev b;
    private final gmg c;
    private final dak d;
    private final Map e = gkl.a(2);
    private String f;

    public dkw(cev cev1, TunesApi tunesapi, dak dak1, gmg gmg)
    {
        b = cev1;
        b.a(this);
        a = tunesapi;
        d = dak1;
        c = gmg;
    }

    static String a(dkw dkw1, String s)
    {
        dkw1.f = s;
        return s;
    }

    static Map a(dkw dkw1)
    {
        return dkw1.e;
    }

    static cev b(dkw dkw1)
    {
        return dkw1.b;
    }

    private UberLatLng b()
    {
        RiderLocation riderlocation = d.b();
        if (riderlocation != null)
        {
            return riderlocation.getUberLatLng();
        }
        riderlocation = d.c();
        if (riderlocation != null)
        {
            return riderlocation.getUberLatLng();
        } else
        {
            return null;
        }
    }

    public final String a()
    {
        return f;
    }

    public final void a(String s, Boolean boolean1, String s1, String s2)
    {
        Double double2 = null;
        Callback callback = new Callback() {

            final dkw a;

            private void a(TunesProvider tunesprovider, Response response)
            {
                dkw.a(a, tunesprovider.getEligibleTrial());
                dkw.a(a).put(tunesprovider.getId(), tunesprovider);
                dkw.b(a).c(new dnp(tunesprovider, response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dkw.a(a).clear();
                dkw.b(a).c(new dnp(retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((TunesProvider)obj, response);
            }

            
            {
                a = dkw.this;
                super();
            }
        };
        String s3 = cwt.a();
        UberLatLng uberlatlng = b();
        Double double1;
        if (uberlatlng != null)
        {
            double1 = Double.valueOf(uberlatlng.a());
        } else
        {
            double1 = null;
        }
        if (uberlatlng != null)
        {
            double2 = Double.valueOf(uberlatlng.b());
        }
        a.provider(s, s3, boolean1, double1, double2, s1, s2, callback);
    }

    public final void a(String s, String s1, String s2)
    {
        if (TextUtils.isEmpty(s2))
        {
            return;
        } else
        {
            Callback callback = new Callback() {

                final dkw a;

                public final void failure(RetrofitError retrofiterror)
                {
                    dkw.b(a).c(new dno(retrofiterror));
                }

                public final void success(Object obj, Response response)
                {
                    dkw.b(a).c(new dno(response));
                }

            
            {
                a = dkw.this;
                super();
            }
            };
            s = gkg.a("access_token", s2, "provider_id", s1, "trip_uuid", s);
            s1 = cwt.a();
            a.handshake(s1, s, callback);
            return;
        }
    }

    public final void a(String s, String s1, String s2, String s3)
    {
        Double double2 = null;
        Callback callback = new Callback() {

            final dkw a;

            private void a(Playlist playlist, Response response)
            {
                dkw.b(a).c(new dms(playlist, response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dkw.b(a).c(new dms(retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((Playlist)obj, response);
            }

            
            {
                a = dkw.this;
                super();
            }
        };
        String s4 = cwt.a();
        UberLatLng uberlatlng = b();
        Double double1;
        if (uberlatlng != null)
        {
            double1 = Double.valueOf(uberlatlng.a());
        } else
        {
            double1 = null;
        }
        if (uberlatlng != null)
        {
            double2 = Double.valueOf(uberlatlng.b());
        }
        a.playlist(s, s1, s4, double1, double2, s2, s3, callback);
    }

    public final void b(String s, String s1, String s2)
    {
        Double double1 = null;
        boolean flag1 = true;
        Object obj;
        UberLatLng uberlatlng;
        boolean flag;
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gjz.a(flag);
        if (!TextUtils.isEmpty(s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gjz.a(flag);
        if (!TextUtils.isEmpty(s2))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        gjz.a(flag);
        uberlatlng = b();
        if (uberlatlng != null)
        {
            obj = Double.valueOf(uberlatlng.a());
        } else
        {
            obj = null;
        }
        if (uberlatlng != null)
        {
            double1 = Double.valueOf(uberlatlng.b());
        }
        s1 = gkg.a("trial", s1, "latitude", obj, "longitude", double1, "city_name", s2);
        s2 = new Callback() {

            final dkw a;

            private void a(TunesProvider tunesprovider, Response response)
            {
                dkw.a(a, null);
                dkw.a(a).put(tunesprovider.getId(), tunesprovider);
                dkw.b(a).c(new ekh(tunesprovider, response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dkw.a(a).clear();
                dkw.b(a).c(new ekh(retrofiterror));
            }

            public final void success(Object obj1, Response response)
            {
                a((TunesProvider)obj1, response);
            }

            
            {
                a = dkw.this;
                super();
            }
        };
        obj = cwt.a();
        a.startTrial(s, ((String) (obj)), s1, s2);
    }

    public final void b(String s, String s1, String s2, String s3)
    {
        a.search(s, s1, s2, s3, new dkx(this, s3));
    }

    public final ekg producePlaylistEvent()
    {
        return new ekg(gkk.a(e.values()));
    }
}
