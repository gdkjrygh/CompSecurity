// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.locations;

import android.os.AsyncTask;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.d.a;
import com.wf.wellsfargomobile.d.c;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.apache.http.client.CircularRedirectException;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

// Referenced classes of package com.wf.wellsfargomobile.locations:
//            s, u, LocationListActivity, ad, 
//            LocationTabListFragment, v

class ac extends AsyncTask
{

    final u a;
    private boolean b;

    private ac(u u1)
    {
        a = u1;
        super();
        b = false;
    }

    ac(u u1, v v)
    {
        this(u1);
    }

    private ArrayList a(String s1)
    {
        XMLReader xmlreader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
        s s2 = new s();
        xmlreader.setContentHandler(s2);
        xmlreader.parse(new InputSource(new StringReader((new a(c.a, s1, null, null, com.wf.wellsfargomobile.locations.u.a(a))).a().toString())));
        return s2.a();
    }

    protected transient Map a(String as[])
    {
        Thread.currentThread().setName("TabletXMLParseTask");
        if (as.length == 3)
        {
            String s1 = as[2];
            if (s1 != null && Boolean.parseBoolean(s1))
            {
                b = true;
            }
        }
        HashMap hashmap = new HashMap();
        try
        {
            hashmap.put("KEY_ATM_RESULTS", a(as[0]));
            hashmap.put("KEY_STORES_RESULTS", a(as[1]));
        }
        catch (Exception exception)
        {
            if (com.wf.wellsfargomobile.locations.u.a(a) != null)
            {
                if ((exception.getCause() instanceof CircularRedirectException) && exception.getCause().getMessage().contains(a.getString(0x7f08015d)))
                {
                    WFApp.A();
                    if (!b)
                    {
                        (new ac(a)).b(new String[] {
                            as[0], as[1], "true"
                        });
                        b = true;
                        return hashmap;
                    }
                } else
                {
                    com.wf.wellsfargomobile.locations.u.a(a).a(a.getString(0x7f080092), a.getString(0x7f08008c));
                    return hashmap;
                }
            }
        }
        return hashmap;
    }

    protected void a(Map map)
    {
        if (com.wf.wellsfargomobile.locations.u.a(a) != null)
        {
            com.wf.wellsfargomobile.locations.u.a(a).h().setVisibility(4);
            if (map == null && !b)
            {
                com.wf.wellsfargomobile.locations.u.a(a).a(a.getString(0x7f080092), a.getString(0x7f08008c));
            } else
            if ((map != null || !b) && map.get("KEY_ATM_RESULTS") != null && map.get("KEY_STORES_RESULTS") != null)
            {
                if (((List)map.get("KEY_ATM_RESULTS")).size() == 0 && ((List)map.get("KEY_STORES_RESULTS")).size() == 0)
                {
                    com.wf.wellsfargomobile.locations.u.a(a).a(a.getString(0x7f080092), a.getString(0x7f08008f));
                    return;
                }
                if (((List)map.get("KEY_ATM_RESULTS")).size() > 0 && ((HashMap)((List)map.get("KEY_ATM_RESULTS")).get(0)).containsKey("error") && ((List)map.get("KEY_STORES_RESULTS")).size() == 0)
                {
                    com.wf.wellsfargomobile.locations.u.a(a).a(a.getString(0x7f080092), a.getString(0x7f08008f));
                    return;
                }
                if (((List)map.get("KEY_ATM_RESULTS")).size() > 0 && ((HashMap)((List)map.get("KEY_ATM_RESULTS")).get(0)).containsKey("error") && ((List)map.get("KEY_STORES_RESULTS")).size() > 0 && ((HashMap)((List)map.get("KEY_STORES_RESULTS")).get(0)).containsKey("error"))
                {
                    com.wf.wellsfargomobile.locations.u.a(a).a(a.getString(0x7f080093), (String)((HashMap)((List)map.get("KEY_ATM_RESULTS")).get(0)).get("error"));
                    return;
                }
                if (((List)map.get("KEY_ATM_RESULTS")).size() >= 2 && !((HashMap)((List)map.get("KEY_ATM_RESULTS")).get(1)).containsKey("serviceType"))
                {
                    com.wf.wellsfargomobile.locations.u.a(a, new CharSequence[((List)map.get("KEY_ATM_RESULTS")).size() - 1]);
                    for (int i = 1; i < ((List)map.get("KEY_ATM_RESULTS")).size(); i++)
                    {
                        HashMap hashmap = (HashMap)((List)map.get("KEY_ATM_RESULTS")).get(i);
                        u.b(a)[Integer.parseInt((String)hashmap.get("id"))] = (new StringBuilder((String)hashmap.get("city"))).append(", ").append((String)hashmap.get("state")).append(" ").append((String)hashmap.get("postalcode"));
                    }

                    map = new android.app.AlertDialog.Builder(com.wf.wellsfargomobile.locations.u.a(a));
                    LinearLayout linearlayout = (LinearLayout)com.wf.wellsfargomobile.locations.u.a(a).getLayoutInflater().inflate(0x7f040026, null);
                    ((TextView)linearlayout.findViewById(0x7f0f0076)).setText(0x7f080033);
                    ((TextView)linearlayout.findViewById(0x7f0f0077)).setText((new StringBuilder()).append(a.getString(0x7f080034)).append(" \"").append(((LocationListActivity)a.getActivity()).g().getQuery()).append("\"").toString());
                    map.setCustomTitle(linearlayout);
                    map.setItems(u.b(a), new ad(this));
                    map.setCancelable(false);
                    map.show();
                    return;
                }
                if (((List)map.get("KEY_ATM_RESULTS")).size() > 0 && ((String)((HashMap)((List)map.get("KEY_ATM_RESULTS")).get(0)).get("id")).matches("-1"))
                {
                    HashMap hashmap1 = (HashMap)((List)map.get("KEY_ATM_RESULTS")).remove(0);
                    ((List)map.get("KEY_STORES_RESULTS")).remove(0);
                    com.wf.wellsfargomobile.locations.u.a(a, Double.parseDouble((String)hashmap1.get("latitude")));
                    u.b(a, Double.parseDouble((String)hashmap1.get("longitude")));
                }
                com.wf.wellsfargomobile.locations.u.c(a).clear();
                com.wf.wellsfargomobile.locations.u.c(a).addAll((Collection)map.get("KEY_ATM_RESULTS"));
                u.d(a).clear();
                u.d(a).addAll((Collection)map.get("KEY_STORES_RESULTS"));
                com.wf.wellsfargomobile.locations.u.a(a).a(com.wf.wellsfargomobile.locations.u.a(a).f().a());
                com.wf.wellsfargomobile.locations.u.a(a).f().b(com.wf.wellsfargomobile.locations.u.a(a).f().a());
                com.wf.wellsfargomobile.locations.u.a(a).f().onTabChanged(com.wf.wellsfargomobile.locations.u.a(a).f().a());
                if (((List)map.get("KEY_ATM_RESULTS")).size() == 0 && ((List)map.get("KEY_STORES_RESULTS")).size() > 0)
                {
                    com.wf.wellsfargomobile.locations.u.a(a).a(a.getString(0x7f080092), a.getString(0x7f080090));
                }
                if (((List)map.get("KEY_STORES_RESULTS")).size() == 0)
                {
                    com.wf.wellsfargomobile.locations.u.a(a).a(a.getString(0x7f080092), a.getString(0x7f080091));
                }
                if (((List)map.get("KEY_ATM_RESULTS")).size() > 0 && ((HashMap)((List)map.get("KEY_ATM_RESULTS")).get(0)).containsKey("error"))
                {
                    com.wf.wellsfargomobile.locations.u.a(a).a(a.getString(0x7f080093), (String)((HashMap)((List)map.get("KEY_ATM_RESULTS")).get(0)).get("error"));
                }
                if (((List)map.get("KEY_STORES_RESULTS")).size() > 0 && ((HashMap)((List)map.get("KEY_STORES_RESULTS")).get(0)).containsKey("error"))
                {
                    com.wf.wellsfargomobile.locations.u.a(a).a(a.getString(0x7f080093), (String)((HashMap)((List)map.get("KEY_STORES_RESULTS")).get(0)).get("error"));
                    return;
                }
            }
        }
    }

    public transient void b(String as[])
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, as);
            return;
        } else
        {
            execute(as);
            return;
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Map)obj);
    }

    protected void onPreExecute()
    {
        com.wf.wellsfargomobile.locations.u.a(a).h().setVisibility(0);
        super.onPreExecute();
    }
}
