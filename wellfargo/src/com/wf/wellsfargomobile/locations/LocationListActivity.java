// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.locations;

import android.app.SearchManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.a;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.h;
import com.google.android.gms.maps.i;
import com.google.android.gms.maps.l;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.b;
import com.google.android.gms.maps.model.d;
import com.google.android.gms.maps.model.e;
import com.wf.wellsfargomobile.BaseActionBarActivity;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.ai;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.wf.wellsfargomobile.locations:
//            h, u, LocationTabListFragment, f, 
//            e, g, i

public class LocationListActivity extends BaseActionBarActivity
    implements h, i
{

    private c b;
    private RelativeLayout c;
    private LocationTabListFragment d;
    private final List e = new ArrayList(30);
    private e f;
    private SearchView g;
    private com.wf.wellsfargomobile.locations.h h;
    private ImageView i;
    private Typeface j;
    private Typeface k;
    private u l;
    private ProgressBar m;
    private boolean n;

    public LocationListActivity()
    {
        h = com.wf.wellsfargomobile.locations.h.a;
        n = true;
    }

    static Typeface a(LocationListActivity locationlistactivity)
    {
        return locationlistactivity.k;
    }

    static void a(LocationListActivity locationlistactivity, e e1)
    {
        locationlistactivity.c(e1);
    }

    private void a(List list)
    {
        if (b != null)
        {
            b.c();
            e.clear();
            d d3 = new d();
            Object obj = new LatLng(l.c(), l.d());
            d3.a(((LatLng) (obj)));
            f = b.a((new MarkerOptions()).a(((LatLng) (obj))).a(com.google.android.gms.maps.model.b.a(0x7f020103)));
            obj = list.iterator();
            int i1 = 1;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                HashMap hashmap = (HashMap)((Iterator) (obj)).next();
                if (hashmap != null)
                {
                    Object obj1 = (String)hashmap.get("latitude");
                    String s = (String)hashmap.get("longitude");
                    int j1;
                    boolean flag;
                    if (obj1 != null)
                    {
                        j1 = 1;
                    } else
                    {
                        j1 = 0;
                    }
                    if (obj1 != null)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (flag & j1)
                    {
                        obj1 = new LatLng(Double.parseDouble(((String) (obj1))), Double.parseDouble(s));
                        d3.a(((LatLng) (obj1)));
                        j1 = getResources().getIdentifier((new StringBuilder()).append("map_wf_").append(i1).toString(), "drawable", getPackageName());
                        if (j1 == 0)
                        {
                            j1 = 0x7f02011f;
                        }
                        e.add(b.a((new MarkerOptions()).a(((LatLng) (obj1))).a((String)hashmap.get("siteName")).b((String)hashmap.get("addrLine1")).a(com.google.android.gms.maps.model.b.a(j1))));
                        i1++;
                    }
                }
            } while (true);
            if (list.size() != 0)
            {
                b.a(com.google.android.gms.maps.b.a(d3.a(), 40));
            } else
            {
                double d1 = l.c();
                double d2 = l.d();
                if (d1 != 0.0D && d2 != 0.0D)
                {
                    b.a(com.google.android.gms.maps.b.a(new LatLng(d1, d2), l.g()));
                    return;
                }
            }
        }
    }

    static Typeface b(LocationListActivity locationlistactivity)
    {
        return locationlistactivity.j;
    }

    private void b(String s)
    {
        boolean flag = true;
        boolean flag1 = true;
        if (s != null)
        {
            flag = flag1;
            if (s.length() > 70)
            {
                flag = false;
            }
            if (s.contains(">") || s.contains("<") || s.contains("\"") || s.contains("?") || s.contains("%") || s.contains("(") || s.contains(")") || s.contains("\\"))
            {
                flag = false;
            }
            if (!s.matches("[ -\177]+"))
            {
                flag = false;
            }
        }
        if (flag)
        {
            l.a(s);
            return;
        } else
        {
            s = new ai();
            Bundle bundle = new Bundle();
            bundle.putInt("DIALOG_ICON", 0x7f0200f9);
            bundle.putString("DIALOG_TITLE", getString(0x7f080093));
            bundle.putString("DIALOG_MESSAGE", getString(0x7f08008e));
            s.setArguments(bundle);
            s.show(getSupportFragmentManager(), "MessageDialogFragment");
            return;
        }
    }

    static List c(LocationListActivity locationlistactivity)
    {
        return locationlistactivity.e;
    }

    private void c(e e1)
    {
        if (getResources().getConfiguration().orientation == 2)
        {
            int i1 = ((RelativeLayout)findViewById(0x7f0f0069)).getHeight();
            Object obj = b.d();
            Point point = ((l) (obj)).a(new LatLng(e1.b().a, e1.b().b));
            obj = ((l) (obj)).a(new Point(point.x, point.y - i1 / 3));
            e1.c();
            e1 = com.google.android.gms.maps.b.a(((LatLng) (obj)));
            b.a(e1);
        }
    }

    static LocationTabListFragment d(LocationListActivity locationlistactivity)
    {
        return locationlistactivity.d;
    }

    static u e(LocationListActivity locationlistactivity)
    {
        return locationlistactivity.l;
    }

    static c f(LocationListActivity locationlistactivity)
    {
        return locationlistactivity.b;
    }

    static void g(LocationListActivity locationlistactivity)
    {
        locationlistactivity.j();
    }

    static void h(LocationListActivity locationlistactivity)
    {
        locationlistactivity.k();
    }

    private void i()
    {
        l.f();
    }

    private void j()
    {
        if (l != null)
        {
            a(l.a());
        }
    }

    private void k()
    {
        a(l.b());
    }

    public void a(int i1)
    {
        e e1 = (e)e.get(i1);
        if (e1 != null)
        {
            e1.c();
            c(e1);
        }
    }

    public void a(e e1)
    {
        int i1 = 0;
_L3:
        e e2;
        if (i1 >= e.size())
        {
            break MISSING_BLOCK_LABEL_345;
        }
        e2 = (e)e.get(i1);
        if (e2 == null || !e2.a().equals(e1.a())) goto _L2; else goto _L1
_L1:
        Object obj;
        HashMap hashmap;
        if ("ATM".equals(d.a()))
        {
            e1 = l.a();
        } else
        {
            e1 = l.b();
        }
        hashmap = (HashMap)e1.get(i1);
        obj = "";
        if (hashmap.containsKey("addrLine1"))
        {
            obj = (new StringBuilder()).append("").append((String)hashmap.get("addrLine1")).toString();
        }
        e1 = ((e) (obj));
        if (hashmap.containsKey("city"))
        {
            e1 = (new StringBuilder()).append(((String) (obj))).append(",").append((String)hashmap.get("city")).toString();
        }
        obj = e1;
        if (hashmap.containsKey("state"))
        {
            obj = (new StringBuilder()).append(e1).append(",").append((String)hashmap.get("state")).toString();
        }
        if (hashmap.containsKey("postalcode"))
        {
            e1 = (new StringBuilder()).append(((String) (obj))).append(",").append((String)hashmap.get("postalcode")).toString();
        } else
        {
            e1 = ((e) (obj));
        }
        obj = URLEncoder.encode(e1, "UTF-8");
        e1 = ((e) (obj));
_L4:
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append(getString(0x7f08016e)).append(e1).toString())));
        return;
_L2:
        i1++;
          goto _L3
        obj;
          goto _L4
        i1 = 0;
          goto _L1
    }

    public void a(String s)
    {
        (new Handler()).postDelayed(new f(this, s), 1000L);
    }

    void a(String s, String s1)
    {
        runOnUiThread(new com.wf.wellsfargomobile.locations.e(this, s, s1));
    }

    public List b()
    {
        return l.a();
    }

    public boolean b(e e1)
    {
        if (e1.equals(f))
        {
            return true;
        } else
        {
            int i1 = e.indexOf(e1);
            f().a(i1);
            (new Handler()).postDelayed(new g(this, e1), 500L);
            return false;
        }
    }

    public List c()
    {
        return l.b();
    }

    public void d()
    {
        c.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, -1, getResources().getInteger(0x7f0c0002)));
        h = com.wf.wellsfargomobile.locations.h.a;
        i.setImageResource(0x7f02003d);
    }

    public void e()
    {
        c.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, -1, 0.0F));
        h = com.wf.wellsfargomobile.locations.h.b;
        i.setImageResource(0x7f02003c);
    }

    LocationTabListFragment f()
    {
        return d;
    }

    SearchView g()
    {
        return g;
    }

    ProgressBar h()
    {
        return m;
    }

    public void logoClick(View view)
    {
        finish();
        overridePendingTransition(0x7f05000d, 0x7f05000f);
    }

    public void onBackPressed()
    {
        Iterator iterator = e.iterator();
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            e e1 = (e)iterator.next();
            if (e1.e())
            {
                e1.d();
                f().b();
                flag = true;
            }
        } while (true);
        if (flag)
        {
            return;
        }
        if (h.equals(com.wf.wellsfargomobile.locations.h.b))
        {
            toggleList(null);
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getLayoutInflater().inflate(0x7f04001b, null);
        a.a(bundle);
        setContentView(0x7f04001e);
        j = Typeface.createFromAsset(getAssets(), "fonts/02520_Arial2.ttf");
        k = Typeface.createFromAsset(getAssets(), "fonts/02534_ArialFett2.ttf");
        b = ((SupportMapFragment)getSupportFragmentManager().findFragmentById(0x7f0f006a)).b();
        b.a(new com.wf.wellsfargomobile.locations.i(this));
        b.a(this);
        b.a(this);
        bundle = getSupportFragmentManager();
        l = (u)bundle.findFragmentByTag("xmlParseTask");
        if (l == null)
        {
            l = new u();
            bundle.beginTransaction().add(l, "xmlParseTask").commit();
            n = false;
        }
        d = (LocationTabListFragment)getSupportFragmentManager().findFragmentById(0x7f0f0068);
        c = (RelativeLayout)findViewById(0x7f0f0067);
        i = (ImageView)findViewById(0x7f0f006b);
        m = (ProgressBar)findViewById(0x7f0f0066);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f100002, menu);
        SearchManager searchmanager = (SearchManager)getSystemService("search");
        g = new SearchView(getSupportActionBar().c());
        g.setSearchableInfo(searchmanager.getSearchableInfo(getComponentName()));
        g.setQueryHint(getString(0x7f080096));
        g.setIconified(true);
        g.setId(0x7f0f0004);
        menu = menu.add(0, 0, 1, "Search").setIcon(0x7f020105);
        MenuItemCompat.setActionView(menu, g);
        MenuItemCompat.setShowAsAction(menu, 2);
        return true;
    }

    protected void onNewIntent(Intent intent)
    {
        setIntent(intent);
        if ("android.intent.action.SEARCH".equals(intent.getAction()))
        {
            b(intent.getStringExtra("query"));
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        int i1;
        super.onOptionsItemSelected(menuitem);
        i1 = menuitem.getItemId();
        if (i1 != 0x7f0f0127) goto _L2; else goto _L1
_L1:
        finish();
        overridePendingTransition(0x7f05000d, 0x7f05000f);
_L4:
        return true;
_L2:
        if (i1 == 0x7f0f0124)
        {
            i();
        } else
        if (i1 == 0x7f0f0126)
        {
            l.e();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onPause()
    {
        InputMethodManager inputmethodmanager = (InputMethodManager)getSystemService("input_method");
        if (inputmethodmanager != null && g != null)
        {
            inputmethodmanager.hideSoftInputFromWindow(g.getWindowToken(), 2);
        }
        super.onPause();
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        com.wf.wellsfargomobile.locations.h h1;
        if (bundle.getBoolean("KEY_LOCATION_LIST_STATE_OPENED", true))
        {
            h1 = com.wf.wellsfargomobile.locations.h.a;
        } else
        {
            h1 = com.wf.wellsfargomobile.locations.h.b;
        }
        h = h1;
        super.onRestoreInstanceState(bundle);
    }

    protected void onResume()
    {
        if (n)
        {
            a(d.a());
            d.a(d.a());
            if (h.equals(com.wf.wellsfargomobile.locations.h.b))
            {
                e();
            }
        }
        WFApp.a(this, (ImageView)findViewById(0x7f0f0061));
        super.onResume();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        boolean flag;
        if (h == com.wf.wellsfargomobile.locations.h.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bundle.putBoolean("KEY_LOCATION_LIST_STATE_OPENED", flag);
        super.onSaveInstanceState(bundle);
    }

    public void toggleList(View view)
    {
        if (h.equals(com.wf.wellsfargomobile.locations.h.a))
        {
            e();
            return;
        } else
        {
            d();
            return;
        }
    }
}
