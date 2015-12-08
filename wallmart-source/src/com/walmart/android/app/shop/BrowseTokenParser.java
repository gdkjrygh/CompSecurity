// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.net.Uri;
import android.util.Base64;
import com.walmartlabs.utils.WLog;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.walmart.android.app.shop:
//            ShopFilterManager

public class BrowseTokenParser
{

    private static final String CAT_ID = "cat_id";
    private static final String DEFAULT_BASE_TOKEN_URL = "http://www.walmart.com/search/search-ng.do";
    private static final String ENCODING = "UTF-8";
    private static final String FACET = "facet";
    private static final String IC = "ic";
    private static final String REFINE_RESULT = "_refineresult";
    private static final String SEARCH_CONSTRAINT = "search_constraint";
    private static final String SEARCH_QUERY = "search_query";
    private static final String TAB_VALUE = "tab_value";
    private static final String TAG = com/walmart/android/app/shop/BrowseTokenParser.getSimpleName();
    private static final String TOKEN_URL_PATH = "search/search-ng.do";
    private static final Pattern sCatIdPattern = Pattern.compile("((?:\\/)((\\d+)(_\\d+)*)(?:\\/|\\?))");
    private String mBrowseToken;
    private String mCatId;
    private Set mFacets;
    private HashMap mParams;
    private Uri mUri;

    public BrowseTokenParser(String s)
    {
        mFacets = new HashSet();
        mParams = new HashMap();
        mBrowseToken = s;
    }

    private static String buildFacets(ArrayList arraylist)
    {
        Object obj = null;
        if (!arraylist.isEmpty())
        {
            obj = new TreeSet();
            for (arraylist = arraylist.iterator(); arraylist.hasNext(); ((TreeSet) (obj)).add(((com.walmart.android.data.StoreQueryResult.Refinement)arraylist.next()).getId())) { }
            obj = StringUtils.join(((Iterable) (obj)), "||");
        }
        return ((String) (obj));
    }

    private static String decode64(String s)
        throws UnsupportedEncodingException, IllegalArgumentException
    {
        return new String(Base64.decode(s.getBytes("UTF-8"), 0), "UTF-8");
    }

    private static String decodeURL(String s)
        throws UnsupportedEncodingException
    {
        return URLDecoder.decode(s, "UTF-8").replaceAll("``", "\"");
    }

    private static String discoverBaseUrl(ArrayList arraylist)
    {
        if (arraylist.isEmpty())
        {
            break MISSING_BLOCK_LABEL_105;
        }
        arraylist = ((com.walmart.android.data.StoreQueryResult.Refinement)arraylist.get(0)).getBrowseToken();
        Object obj;
        obj = decode64(arraylist);
        if (!((String) (obj)).startsWith("http"))
        {
            break MISSING_BLOCK_LABEL_105;
        }
        obj = Uri.parse(((String) (obj))).buildUpon();
        ((android.net.Uri.Builder) (obj)).query(null);
        ((android.net.Uri.Builder) (obj)).fragment(null);
        ((android.net.Uri.Builder) (obj)).path("search/search-ng.do");
        obj = ((android.net.Uri.Builder) (obj)).build().toString();
        return ((String) (obj));
        Object obj1;
        obj1;
        WLog.w(TAG, (new StringBuilder()).append("Could not decode browseToken: ").append(arraylist).append("\n").append(obj1).toString());
_L2:
        return "http://www.walmart.com/search/search-ng.do";
        obj1;
        WLog.w(TAG, (new StringBuilder()).append("Could not decode browseToken: ").append(arraylist).append("\n").append(obj1).toString());
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String encode64(String s)
        throws UnsupportedEncodingException
    {
        return new String(Base64.encode(s.getBytes("UTF-8"), 2), "UTF-8");
    }

    private void extractDepartmentId(String s)
    {
        if (mParams.containsKey("cat_id"))
        {
            mCatId = (String)mParams.get("cat_id");
        } else
        {
            s = sCatIdPattern.matcher(s);
            if (s.find() && s.groupCount() > 2)
            {
                mCatId = s.group(2);
                return;
            }
        }
    }

    private void extractFacets()
    {
        if (mParams.containsKey("facet"))
        {
            mFacets.addAll(Arrays.asList(((String)mParams.get("facet")).split("\\|\\|")));
        }
    }

    private void extractParams()
        throws UnsupportedEncodingException
    {
        Iterator iterator = mUri.getQueryParameterNames().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (s != null)
            {
                String s1 = mUri.getQueryParameter(s);
                if (s1 != null)
                {
                    mParams.put(s, decodeURL(s1));
                }
            }
        } while (true);
    }

    private static String fixUrlEncoding(String s)
    {
        return s.replaceAll("%20", "+").replaceAll("%22", "%60%60").replaceAll("%26quot%3B", "%60%60").replaceAll("%26amp%3B", "&");
    }

    public static String[] generateSingleRefinementToken(ShopFilterManager shopfiltermanager, int i, int j)
    {
        if (shopfiltermanager.getRefinements() != null && !shopfiltermanager.getRefinements().isEmpty())
        {
            android.net.Uri.Builder builder = Uri.parse(discoverBaseUrl(shopfiltermanager.getRefinements())).buildUpon();
            builder.appendQueryParameter("_refineresult", "true");
            builder.appendQueryParameter("ic", (new StringBuilder()).append("").append(i).append("_").append(j).toString());
            builder.appendQueryParameter("search_constraint", "0");
            builder.appendQueryParameter("tab_value", "All");
            if (shopfiltermanager.getSearchQuery() != null)
            {
                builder.appendQueryParameter("search_query", shopfiltermanager.getSearchQuery());
            }
            String s = buildFacets(shopfiltermanager.getRefinements());
            if (s != null)
            {
                builder.appendQueryParameter("facet", s);
            }
            s = null;
            if (shopfiltermanager.getBrowseToken() != null)
            {
                shopfiltermanager = new BrowseTokenParser(shopfiltermanager.getBrowseToken());
                shopfiltermanager.parse();
                s = shopfiltermanager.getDepartmentId();
            }
            if (s != null)
            {
                builder.appendQueryParameter("cat_id", s);
            }
            shopfiltermanager = fixUrlEncoding(builder.build().toString());
            try
            {
                shopfiltermanager = encode64(shopfiltermanager);
            }
            // Misplaced declaration of an exception variable
            catch (ShopFilterManager shopfiltermanager)
            {
                WLog.w(TAG, (new StringBuilder()).append("Could not create browseToken\n").append(shopfiltermanager).toString());
                return new String[0];
            }
            return (new String[] {
                shopfiltermanager
            });
        } else
        {
            return new String[0];
        }
    }

    public String getDepartmentId()
    {
        return mCatId;
    }

    public Set getFacets()
    {
        return mFacets;
    }

    public void parse()
    {
        try
        {
            String s = decode64(mBrowseToken);
            mUri = Uri.parse(s);
            extractParams();
            extractDepartmentId(s);
            extractFacets();
            return;
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            WLog.w(TAG, (new StringBuilder()).append("Could not decode browseToken: ").append(mBrowseToken).append("\n").append(unsupportedencodingexception).toString());
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            WLog.w(TAG, (new StringBuilder()).append("Could not decode browseToken: ").append(mBrowseToken).append("\n").append(illegalargumentexception).toString());
        }
    }

}
