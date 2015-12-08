// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import android.os.Bundle;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationListener;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationManager;
import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.util.AddressUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.data:
//            WishLocalizedCurrencyValue, WishImage, WishTag, WishRating, 
//            WishProductExtraImage, WishUser, WishAddToCartOffer, WishRatingSizeSummary, 
//            WishHourlyDeal, WishPromoBannerSpec, WishProductDescription, WishCredit

public class WishProduct
    implements ApiDataChangeNotificationListener, Serializable
{
    public static final class DiscountMode extends Enum
    {

        private static final DiscountMode $VALUES[];
        public static final DiscountMode Commerce;
        public static final DiscountMode CommerceOutOfStock;

        public static DiscountMode valueOf(String s)
        {
            return (DiscountMode)Enum.valueOf(com/contextlogic/wish/api/data/WishProduct$DiscountMode, s);
        }

        public static DiscountMode[] values()
        {
            return (DiscountMode[])$VALUES.clone();
        }

        static 
        {
            Commerce = new DiscountMode("Commerce", 0);
            CommerceOutOfStock = new DiscountMode("CommerceOutOfStock", 1);
            $VALUES = (new DiscountMode[] {
                Commerce, CommerceOutOfStock
            });
        }

        private DiscountMode(String s, int i)
        {
            super(s, i);
        }
    }

    private class WishProductSize
        implements Serializable
    {

        private static final long serialVersionUID = 0x62aa7c1f435e261bL;
        public String ordering;
        public Double orderingValue;
        public String size;
        final WishProduct this$0;

        public WishProductSize(String s, String s1)
        {
            this$0 = WishProduct.this;
            super();
            size = s;
            ordering = s1;
            try
            {
                orderingValue = Double.valueOf(s1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (WishProduct wishproduct)
            {
                return;
            }
        }
    }

    private class WishProductVariation
        implements Serializable
    {

        private static final long serialVersionUID = 0x38b2e84cfdbc0acL;
        public String color;
        public String size;
        final WishProduct this$0;

        private WishProductVariation()
        {
            this$0 = WishProduct.this;
            super();
        }

    }


    public static final int MAX_COMMENTS = 2;
    private static final long serialVersionUID = 0x1017369b55ff798eL;
    private WishAddToCartOffer addToCartOffer;
    private ArrayList alreadyRecommended;
    private ArrayList alreadyRecommendedGoogleIds;
    private double aspectRatio;
    private double averageRating;
    private String brand;
    private String buyLink;
    private int commentCount;
    private String commerceProductId;
    private WishLocalizedCurrencyValue commerceValue;
    private WishCredit credit;
    private String creditId;
    private String defaultCommerceVariationId;
    private String description;
    private String externalUrl;
    private ArrayList extraPhotos;
    private String fbCommentUrl;
    private WishLocalizedCurrencyValue hiddenValue;
    private ArrayList hiddenVariationColors;
    private ArrayList hiddenVariationSizes;
    private WishHourlyDeal hourlyDeal;
    private WishImage image;
    private boolean inStock;
    private boolean isAlreadyWishing;
    private boolean isC2C;
    private boolean isCommerceProduct;
    private boolean isConcept;
    private boolean isNewWithTags;
    private boolean isPreview;
    private int maxShippingTime;
    private String merchantId;
    private String merchantName;
    private double merchantRating;
    private int merchantRatingCount;
    private String merchantUniqueName;
    private String merchantUserId;
    private int minShippingTime;
    private String name;
    private int numBought;
    private int numWishes;
    private String originalBuyLink;
    private WishImage originalImage;
    private double originalImageHeight;
    private double originalImageWidth;
    private String productId;
    private WishPromoBannerSpec promoBannerSpec;
    private int ratingCount;
    private WishRatingSizeSummary ratingSizeSummary;
    private String rawName;
    private double rebatePercentage;
    private WishLocalizedCurrencyValue rebateValue;
    private ArrayList recommendFbUsers;
    private ArrayList relatedProducts;
    private String returnPolicyLongString;
    private String returnPolicyShortString;
    private String shareMessage;
    private String shareSubject;
    private String shippingCountriesString;
    private String shippingOfferText;
    private String shippingOfferTitle;
    private WishLocalizedCurrencyValue shippingPrice;
    private String shippingPriceCountry;
    private String shippingTimeString;
    private String shipsFrom;
    private WishLocalizedCurrencyValue signupGiftPrice;
    private String sizingChartUrl;
    private ArrayList structuredDescriptions;
    private ArrayList tags;
    private String taxText;
    private ArrayList topRatings;
    private int totalInventory;
    private String urgencyText;
    private WishUser userCreator;
    private WishLocalizedCurrencyValue value;
    private ArrayList variationColors;
    private HashMap variationIdMapping;
    private HashMap variationImageMapping;
    private HashMap variationPriceBeforeDiscountsMapping;
    private HashMap variationPriceMapping;
    private HashMap variationRetailPriceMapping;
    private ArrayList variationSizes;
    private HashMap variationStockMapping;
    private String wishGuaranteeText;
    private String youtubeVideoId;

    public WishProduct(String s)
    {
        this(s, null);
    }

    public WishProduct(String s, String s1)
    {
        variationColors = new ArrayList();
        variationSizes = new ArrayList();
        hiddenVariationColors = new ArrayList();
        hiddenVariationSizes = new ArrayList();
        variationIdMapping = new HashMap();
        variationStockMapping = new HashMap();
        variationPriceBeforeDiscountsMapping = new HashMap();
        variationPriceMapping = new HashMap();
        variationRetailPriceMapping = new HashMap();
        variationImageMapping = new HashMap();
        hiddenValue = new WishLocalizedCurrencyValue(-1D);
        value = new WishLocalizedCurrencyValue(0.0D);
        productId = s;
        if (s1 != null)
        {
            image = new WishImage(s1);
        }
        isPreview = true;
    }

    public WishProduct(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        variationColors = new ArrayList();
        variationSizes = new ArrayList();
        hiddenVariationColors = new ArrayList();
        hiddenVariationSizes = new ArrayList();
        variationPriceBeforeDiscountsMapping = new HashMap();
        variationIdMapping = new HashMap();
        variationStockMapping = new HashMap();
        variationPriceMapping = new HashMap();
        variationRetailPriceMapping = new HashMap();
        variationImageMapping = new HashMap();
        hiddenValue = new WishLocalizedCurrencyValue(-1D);
        value = new WishLocalizedCurrencyValue(0.0D);
        if (!jsonobject.has("picture"))
        {
            break MISSING_BLOCK_LABEL_347;
        }
        image = new WishImage(jsonobject.getString("picture"));
        isPreview = true;
_L1:
        productId = jsonobject.getString("id");
        name = jsonobject.getString("name");
        rawName = name;
        if (jsonobject.has("raw_name") && !jsonobject.isNull("raw_name"))
        {
            rawName = jsonobject.getString("raw_name");
        }
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.ProductRecommendation, this);
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.Wish, this);
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.Unwish, this);
        if (jsonobject.has("value") && !jsonobject.isNull("value"))
        {
            value = new WishLocalizedCurrencyValue(jsonobject.getDouble("value"), jsonobject.optJSONObject("localized_value"));
        }
        if (!WishApplication.getAppInstance().isScreenshotBuild() && jsonobject.has("urgency_text") && !jsonobject.isNull("urgency_text"))
        {
            urgencyText = jsonobject.getString("urgency_text");
        }
        if (isPreview)
        {
            return;
        }
        break MISSING_BLOCK_LABEL_516;
        Object obj;
        HashMap hashmap;
        int i;
        boolean flag;
        try
        {
            image = new WishImage(jsonobject.getString("display_picture"));
            image.setUrlString(jsonobject.getString("small_picture"), WishImage.ImageSize.Small);
            image.setUrlString(jsonobject.getString("display_picture"), WishImage.ImageSize.Medium);
            image.setUrlString(jsonobject.getString("contest_page_picture"), WishImage.ImageSize.Large);
            if (jsonobject.has("original_display_picture"))
            {
                originalImage = new WishImage(jsonobject.getString("original_display_picture"));
                originalImage.setUrlString(jsonobject.getString("original_small_picture"), WishImage.ImageSize.Small);
                originalImage.setUrlString(jsonobject.getString("original_display_picture"), WishImage.ImageSize.Medium);
                originalImage.setUrlString(jsonobject.getString("original_contest_page_picture"), WishImage.ImageSize.Large);
            }
            isPreview = false;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
          goto _L1
        externalUrl = jsonobject.getString("external_url");
        fbCommentUrl = jsonobject.getString("fb_comment_url");
        aspectRatio = jsonobject.getDouble("aspect_ratio");
        Object obj1;
        Object obj3;
        Throwable throwable;
        Object obj4;
        Object obj5;
        Object obj6;
        WishLocalizedCurrencyValue wishlocalizedcurrencyvalue;
        ArrayList arraylist;
        ArrayList arraylist1;
        JSONArray jsonarray;
        JSONObject jsonobject1;
        String s;
        String s1;
        String s2;
        int j;
        byte byte0;
        if (jsonobject.has("user_in_active_sweep") && jsonobject.getBoolean("user_in_active_sweep"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isAlreadyWishing = flag;
        isConcept = jsonobject.getBoolean("is_concept");
        tags = new ArrayList();
        if (!jsonobject.has("tags")) goto _L3; else goto _L2
_L2:
        obj = jsonobject.getJSONArray("tags");
        i = 0;
_L4:
        if (i >= ((JSONArray) (obj)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        tags.add(new WishTag(((JSONArray) (obj)).getJSONObject(i)));
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        topRatings = new ArrayList();
        if (!jsonobject.has("top_ratings")) goto _L6; else goto _L5
_L5:
        obj = jsonobject.getJSONArray("top_ratings");
        i = 0;
_L7:
        if (i >= ((JSONArray) (obj)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        topRatings.add(new WishRating(((JSONArray) (obj)).getJSONObject(i)));
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        relatedProducts = new ArrayList();
        if (!jsonobject.has("related_contests")) goto _L9; else goto _L8
_L8:
        obj = jsonobject.getJSONArray("related_contests");
        i = 0;
_L10:
        if (i >= ((JSONArray) (obj)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        relatedProducts.add(new WishProduct(((JSONArray) (obj)).getJSONObject(i)));
        i++;
        if (true) goto _L10; else goto _L9
_L9:
        extraPhotos = new ArrayList();
        hashmap = new HashMap();
        if (!jsonobject.has("extra_photo_urls"))
        {
            break MISSING_BLOCK_LABEL_956;
        }
        obj = jsonobject.getJSONObject("extra_photo_urls");
        Object obj2;
        for (Iterator iterator2 = ((JSONObject) (obj)).keys(); iterator2.hasNext(); hashmap.put(Integer.valueOf(i), obj2))
        {
            obj2 = (String)iterator2.next();
            i = Integer.valueOf(((String) (obj2))).intValue();
            obj2 = new WishProductExtraImage(i, ((JSONObject) (obj)).getString(((String) (obj2))));
            extraPhotos.add(obj2);
        }

        if (extraPhotos.size() > 0)
        {
            Collections.sort(extraPhotos, new Comparator() {

                final WishProduct this$0;

                public int compare(WishProductExtraImage wishproductextraimage, WishProductExtraImage wishproductextraimage1)
                {
                    return wishproductextraimage.getSequenceId() - wishproductextraimage1.getSequenceId();
                }

                public volatile int compare(Object obj7, Object obj8)
                {
                    return compare((WishProductExtraImage)obj7, (WishProductExtraImage)obj8);
                }

            
            {
                this$0 = WishProduct.this;
                super();
            }
            });
        }
        if (!jsonobject.has("extra_photo_details") || jsonobject.isNull("extra_photo_details")) goto _L12; else goto _L11
_L11:
        obj = jsonobject.getJSONObject("extra_photo_details");
        obj1 = ((JSONObject) (obj)).keys();
_L13:
        if (!((Iterator) (obj1)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj4 = (String)((Iterator) (obj1)).next();
        obj3 = (WishProductExtraImage)hashmap.get(Integer.valueOf(((String) (obj4))));
        if (obj3 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj4 = ((JSONObject) (obj)).getJSONObject(((String) (obj4)));
        ((WishProductExtraImage) (obj3)).setUploader(new WishUser(((JSONObject) (obj4)).getJSONObject("user")));
        if (((JSONObject) (obj4)).has("size") && !((JSONObject) (obj4)).isNull("size"))
        {
            ((WishProductExtraImage) (obj3)).setSize(((JSONObject) (obj4)).getString("size"));
        }
        continue; /* Loop/switch isn't completed */
        throwable;
        if (true) goto _L13; else goto _L12
_L12:
        if (!jsonobject.has("num_entered")) goto _L15; else goto _L14
_L14:
        numWishes = jsonobject.getInt("num_entered");
_L29:
        numBought = jsonobject.optInt("num_bought", 0);
        commentCount = jsonobject.optInt("comment_count", 0);
        if (jsonobject.has("user_creator"))
        {
            userCreator = new WishUser(jsonobject.getJSONObject("user_creator"));
        }
        if (jsonobject.has("buy_link") && !jsonobject.isNull("buy_link"))
        {
            buyLink = jsonobject.getString("buy_link");
        }
        if (jsonobject.has("original_link") && !jsonobject.isNull("original_link"))
        {
            originalBuyLink = jsonobject.getString("original_link");
        }
        if (!jsonobject.has("video") || jsonobject.isNull("video")) goto _L17; else goto _L16
_L16:
        obj = jsonobject.getJSONObject("video");
        if (!((JSONObject) (obj)).getString("source").equals("youtube")) goto _L17; else goto _L18
_L18:
        obj = Pattern.compile(".*(?:youtu.be\\/|v\\/|u\\/\\w\\/|embed\\/|watch\\?v=|featured\\?v=|&v=)([^#\\&\\?]*).*").matcher(((JSONObject) (obj)).getString("url"));
        flag = ((Matcher) (obj)).matches();
        if (!flag) goto _L17; else goto _L19
_L19:
        try
        {
            youtubeVideoId = ((Matcher) (obj)).group(1);
        }
        catch (IndexOutOfBoundsException indexoutofboundsexception) { }
_L17:
        if (!jsonobject.has("orig_width") || jsonobject.isNull("orig_width")) goto _L21; else goto _L20
_L20:
        originalImageWidth = jsonobject.getDouble("orig_width");
_L30:
        if (!jsonobject.has("orig_height") || jsonobject.isNull("orig_height")) goto _L23; else goto _L22
_L22:
        originalImageHeight = jsonobject.getDouble("orig_height");
_L31:
        if (!jsonobject.has("brand") || jsonobject.isNull("brand")) goto _L25; else goto _L24
_L24:
        brand = jsonobject.getString("brand");
_L32:
        if (jsonobject.has("description") && !jsonobject.isNull("description"))
        {
            description = jsonobject.getString("description");
            if (description.trim().equals(""))
            {
                description = null;
            }
        }
        if (jsonobject.has("sizing_chart_url") && !jsonobject.isNull("sizing_chart_url"))
        {
            sizingChartUrl = jsonobject.getString("sizing_chart_url");
            if (sizingChartUrl.trim().equals(""))
            {
                sizingChartUrl = null;
            }
        }
        alreadyRecommended = new ArrayList();
        if (!jsonobject.has("already_recommended") || jsonobject.isNull("already_recommended")) goto _L27; else goto _L26
_L26:
        obj = jsonobject.getJSONArray("already_recommended");
        i = 0;
_L28:
        if (i >= ((JSONArray) (obj)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        alreadyRecommended.add(((JSONArray) (obj)).getString(i));
        i++;
        if (true) goto _L28; else goto _L27
_L15:
label0:
        {
            if (!jsonobject.has("num_wishes"))
            {
                break label0;
            }
            numWishes = jsonobject.getInt("num_wishes");
        }
          goto _L29
        numWishes = 0;
          goto _L29
_L21:
        originalImageWidth = -1D;
          goto _L30
_L23:
        originalImageHeight = -1D;
          goto _L31
_L25:
        brand = null;
          goto _L32
_L27:
        alreadyRecommendedGoogleIds = new ArrayList();
        if (!jsonobject.has("already_recommended_google_ids") || jsonobject.isNull("already_recommended_google_ids")) goto _L34; else goto _L33
_L33:
        obj = jsonobject.getJSONArray("already_recommended_google_ids");
        i = 0;
_L35:
        if (i >= ((JSONArray) (obj)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        alreadyRecommendedGoogleIds.add(((JSONArray) (obj)).getString(i));
        i++;
        if (true) goto _L35; else goto _L34
_L34:
        if (jsonobject.has("shipping_offer_title") && !jsonobject.isNull("shipping_offer_title"))
        {
            shippingOfferTitle = jsonobject.getString("shipping_offer_title");
        }
        if (jsonobject.has("shipping_offer_text") && !jsonobject.isNull("shipping_offer_text"))
        {
            shippingOfferText = jsonobject.getString("shipping_offer_text");
        }
        if (jsonobject.has("wish_guarantee") && !jsonobject.isNull("wish_guarantee"))
        {
            wishGuaranteeText = jsonobject.getString("wish_guarantee");
        }
        if (jsonobject.has("share_subject") && !jsonobject.isNull("share_subject"))
        {
            shareSubject = jsonobject.getString("share_subject");
        }
        if (jsonobject.has("share_message") && !jsonobject.isNull("share_message"))
        {
            shareMessage = jsonobject.getString("share_message");
        }
        if (jsonobject.has("signup_gift_price") && !jsonobject.isNull("signup_gift_price"))
        {
            signupGiftPrice = new WishLocalizedCurrencyValue(jsonobject.optDouble("signup_gift_price"), jsonobject.optJSONObject("localized_signup_gift_price"));
        }
        if (!jsonobject.has("add_to_cart_offer"))
        {
            break MISSING_BLOCK_LABEL_1963;
        }
        flag = jsonobject.isNull("add_to_cart_offer");
        if (flag)
        {
            break MISSING_BLOCK_LABEL_1963;
        }
        try
        {
            addToCartOffer = new WishAddToCartOffer(jsonobject.getJSONObject("add_to_cart_offer"));
        }
        catch (ApiMalformedDataException apimalformeddataexception3) { }
        if (!jsonobject.has("rating_size_summary"))
        {
            break MISSING_BLOCK_LABEL_2005;
        }
        flag = jsonobject.isNull("rating_size_summary");
        if (flag)
        {
            break MISSING_BLOCK_LABEL_2005;
        }
        try
        {
            ratingSizeSummary = new WishRatingSizeSummary(jsonobject.getJSONObject("rating_size_summary"));
        }
        catch (ApiMalformedDataException apimalformeddataexception2) { }
        if (!jsonobject.has("hourly_deal"))
        {
            break MISSING_BLOCK_LABEL_2047;
        }
        flag = jsonobject.isNull("hourly_deal");
        if (flag)
        {
            break MISSING_BLOCK_LABEL_2047;
        }
        try
        {
            hourlyDeal = new WishHourlyDeal(jsonobject.getJSONObject("hourly_deal"));
        }
        catch (ApiMalformedDataException apimalformeddataexception1) { }
        if (!jsonobject.has("promo_banner_spec"))
        {
            break MISSING_BLOCK_LABEL_2089;
        }
        flag = jsonobject.isNull("promo_banner_spec");
        if (flag)
        {
            break MISSING_BLOCK_LABEL_2089;
        }
        try
        {
            promoBannerSpec = new WishPromoBannerSpec(jsonobject.getJSONObject("promo_banner_spec"));
        }
        catch (ApiMalformedDataException apimalformeddataexception) { }
        if (!jsonobject.has("product_rating")) goto _L37; else goto _L36
_L36:
        obj = jsonobject.getJSONObject("product_rating");
        ratingCount = ((JSONObject) (obj)).getInt("rating_count");
        averageRating = ((JSONObject) (obj)).getDouble("rating");
_L41:
        structuredDescriptions = new ArrayList();
        if (!jsonobject.has("structured_description") || jsonobject.isNull("structured_description")) goto _L39; else goto _L38
_L38:
        obj = jsonobject.getJSONArray("structured_description");
        i = 0;
_L40:
        if (i >= ((JSONArray) (obj)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        structuredDescriptions.add(new WishProductDescription(((JSONArray) (obj)).getJSONObject(i)));
        i++;
        if (true) goto _L40; else goto _L39
_L37:
        ratingCount = 0;
        averageRating = 5D;
          goto _L41
_L39:
        commerceProductId = productId;
        if (!jsonobject.has("commerce_product_info") || jsonobject.isNull("commerce_product_info")) goto _L43; else goto _L42
_L42:
        isCommerceProduct = true;
        arraylist1 = new ArrayList();
        arraylist = new ArrayList();
        new HashSet();
        obj = jsonobject.getJSONObject("commerce_product_info");
        commerceProductId = ((JSONObject) (obj)).getString("id");
        totalInventory = ((JSONObject) (obj)).optInt("total_inventory", 0);
        if (totalInventory > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        inStock = flag;
        if (!((JSONObject) (obj)).has("variations") || ((JSONObject) (obj)).isNull("variations")) goto _L45; else goto _L44
_L44:
        jsonarray = ((JSONObject) (obj)).getJSONArray("variations");
        j = 0;
_L49:
        if (j >= jsonarray.length()) goto _L45; else goto _L46
_L46:
        jsonobject1 = jsonarray.getJSONObject(j);
        wishlocalizedcurrencyvalue = null;
        obj5 = null;
        obj4 = null;
        obj = null;
        obj6 = null;
        throwable = "0";
        byte0 = -1;
        obj1 = throwable;
        if (!jsonobject1.has("size_ordering"))
        {
            break MISSING_BLOCK_LABEL_2440;
        }
        obj1 = throwable;
        if (!jsonobject1.isNull("size_ordering"))
        {
            obj1 = jsonobject1.getString("size_ordering");
        }
        throwable = ((Throwable) (obj4));
        if (!jsonobject1.has("size"))
        {
            break MISSING_BLOCK_LABEL_2480;
        }
        throwable = ((Throwable) (obj4));
        if (!jsonobject1.isNull("size"))
        {
            throwable = jsonobject1.getString("size");
        }
        obj4 = obj5;
        if (!jsonobject1.has("color"))
        {
            break MISSING_BLOCK_LABEL_2520;
        }
        obj4 = obj5;
        if (!jsonobject1.isNull("color"))
        {
            obj4 = jsonobject1.getString("color");
        }
        obj5 = obj6;
        if (!jsonobject1.has("hidden_size"))
        {
            break MISSING_BLOCK_LABEL_2560;
        }
        obj5 = obj6;
        if (!jsonobject1.isNull("hidden_size"))
        {
            obj5 = jsonobject1.getString("hidden_size");
        }
        obj6 = obj;
        if (!jsonobject1.has("hidden_color"))
        {
            break MISSING_BLOCK_LABEL_2598;
        }
        obj6 = obj;
        if (!jsonobject1.isNull("hidden_color"))
        {
            obj6 = jsonobject1.getString("hidden_color");
        }
        obj = wishlocalizedcurrencyvalue;
        if (!jsonobject1.has("variation_id"))
        {
            break MISSING_BLOCK_LABEL_2635;
        }
        obj = wishlocalizedcurrencyvalue;
        if (!jsonobject1.isNull("variation_id"))
        {
            obj = jsonobject1.getString("variation_id");
        }
        i = byte0;
        if (!jsonobject1.has("sequence_id"))
        {
            break MISSING_BLOCK_LABEL_2679;
        }
        flag = jsonobject1.isNull("sequence_id");
        i = byte0;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_2679;
        }
        i = jsonobject1.getInt("sequence_id");
_L50:
        if (obj == null) goto _L48; else goto _L47
_L47:
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_2710;
        }
        if (!variationColors.contains(obj4))
        {
            variationColors.add(obj4);
        }
        if (throwable == null)
        {
            break MISSING_BLOCK_LABEL_2732;
        }
        arraylist.add(new WishProductSize(throwable, ((String) (obj1))));
        if (obj6 == null)
        {
            break MISSING_BLOCK_LABEL_2759;
        }
        if (!hiddenVariationColors.contains(obj6))
        {
            hiddenVariationColors.add(obj6);
        }
        if (obj5 == null)
        {
            break MISSING_BLOCK_LABEL_2781;
        }
        arraylist1.add(new WishProductSize(((String) (obj5)), ((String) (obj1))));
        obj1 = new WishProductVariation();
        obj1.size = throwable;
        obj1.color = ((String) (obj4));
        variationIdMapping.put(obj, obj1);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_2851;
        }
        if (hashmap.containsKey(Integer.valueOf(i)))
        {
            variationImageMapping.put(obj, hashmap.get(Integer.valueOf(i)));
        }
        JSONException jsonexception;
        if (jsonobject1.getInt("inventory") > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (jsonobject1.optBoolean("is_c2c", false))
        {
            isC2C = true;
        }
        obj5 = new WishLocalizedCurrencyValue(jsonobject1.getDouble("price"), jsonobject1.optJSONObject("localized_price"));
        wishlocalizedcurrencyvalue = new WishLocalizedCurrencyValue(jsonobject1.getDouble("price_before_personal_price"), jsonobject1.optJSONObject("localized_price_before_personal_price"));
        obj1 = new WishLocalizedCurrencyValue(jsonobject1.optDouble("retail_price", 0.0D), jsonobject1.optJSONObject("localized_retail_price"));
        if (((WishLocalizedCurrencyValue) (obj1)).getValue() == 0.0D)
        {
            obj1 = obj5;
        }
        if (defaultCommerceVariationId != null)
        {
            break MISSING_BLOCK_LABEL_3476;
        }
        s = jsonobject1.optString("merchant");
        s1 = jsonobject1.optString("merchant_name");
        s2 = jsonobject1.optString("merchant_id");
        obj4 = null;
        throwable = ((Throwable) (obj4));
        if (!jsonobject1.optBoolean("is_c2c", false))
        {
            break MISSING_BLOCK_LABEL_3045;
        }
        throwable = ((Throwable) (obj4));
        if (userCreator != null)
        {
            throwable = userCreator.getUserId();
        }
        if (jsonobject1.has("tax_text") && !jsonobject1.isNull("tax_text"))
        {
            taxText = jsonobject1.getString("tax_text");
        }
        if (jsonobject1.has("return_policy_short") && !jsonobject1.isNull("return_policy_short"))
        {
            returnPolicyShortString = jsonobject1.getString("return_policy_short");
        }
        if (jsonobject1.has("return_policy_long") && !jsonobject1.isNull("return_policy_long"))
        {
            returnPolicyLongString = jsonobject1.getString("return_policy_long");
        }
        if (jsonobject1.has("shipping_price_country_code") && !jsonobject1.isNull("shipping_price_country_code"))
        {
            shippingPriceCountry = AddressUtil.getCountryName(jsonobject1.getString("shipping_price_country_code"));
        }
        obj6 = new WishLocalizedCurrencyValue(jsonobject1.optDouble("hidden_retail_price", 0.0D), jsonobject1.optJSONObject("localized_hidden_retail_price"));
        obj4 = obj6;
        if (((WishLocalizedCurrencyValue) (obj6)).getValue() == 0.0D)
        {
            obj4 = new WishLocalizedCurrencyValue(-1D);
        }
        hiddenValue = ((WishLocalizedCurrencyValue) (obj4));
        minShippingTime = jsonobject1.optInt("min_shipping_time", 7);
        maxShippingTime = jsonobject1.optInt("max_shipping_time", 21);
        shippingPrice = new WishLocalizedCurrencyValue(jsonobject1.getDouble("shipping"), jsonobject1.optJSONObject("localized_shipping"));
        if (jsonobject1.has("shipping_countries_string") && !jsonobject1.isNull("shipping_countries_string"))
        {
            shippingCountriesString = jsonobject1.getString("shipping_countries_string");
        }
        if (jsonobject1.has("shipping_time_string") && !jsonobject1.isNull("shipping_time_string"))
        {
            shippingTimeString = jsonobject1.getString("shipping_time_string");
        }
        if (jsonobject1.has("ships_from") && !jsonobject1.isNull("ships_from"))
        {
            shipsFrom = jsonobject1.getString("ships_from");
        }
        value = ((WishLocalizedCurrencyValue) (obj1));
        isNewWithTags = jsonobject1.optBoolean("new_with_tags", false);
        defaultCommerceVariationId = ((String) (obj));
        commerceValue = ((WishLocalizedCurrencyValue) (obj5));
        merchantName = s;
        merchantUniqueName = s1;
        merchantUserId = throwable;
        merchantRating = jsonobject1.optDouble("merchant_rating");
        merchantRatingCount = jsonobject1.optInt("merchant_rating_count");
        merchantId = s2;
        variationPriceMapping.put(obj, obj5);
        variationPriceBeforeDiscountsMapping.put(obj, wishlocalizedcurrencyvalue);
        variationRetailPriceMapping.put(obj, obj1);
        variationStockMapping.put(obj, Boolean.valueOf(flag));
          goto _L48
_L45:
        Collections.sort(arraylist1, new Comparator() {

            final WishProduct this$0;
            final boolean val$hiddenSortAsNumbers;

            public int compare(WishProductSize wishproductsize2, WishProductSize wishproductsize3)
            {
                if (hiddenSortAsNumbers)
                {
                    return wishproductsize2.orderingValue.compareTo(wishproductsize3.orderingValue);
                } else
                {
                    return wishproductsize2.ordering.compareTo(wishproductsize3.ordering);
                }
            }

            public volatile int compare(Object obj7, Object obj8)
            {
                return compare((WishProductSize)obj7, (WishProductSize)obj8);
            }

            
            {
                this$0 = WishProduct.this;
                hiddenSortAsNumbers = flag;
                super();
            }
        });
        Iterator iterator = arraylist1.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            WishProductSize wishproductsize = (WishProductSize)iterator.next();
            if (!hiddenVariationSizes.contains(wishproductsize.size))
            {
                hiddenVariationSizes.add(wishproductsize.size);
            }
        } while (true);
        Collections.sort(arraylist, new Comparator() {

            final WishProduct this$0;
            final boolean val$sortAsNumbers;

            public int compare(WishProductSize wishproductsize2, WishProductSize wishproductsize3)
            {
                if (sortAsNumbers)
                {
                    return wishproductsize2.orderingValue.compareTo(wishproductsize3.orderingValue);
                } else
                {
                    return wishproductsize2.ordering.compareTo(wishproductsize3.ordering);
                }
            }

            public volatile int compare(Object obj7, Object obj8)
            {
                return compare((WishProductSize)obj7, (WishProductSize)obj8);
            }

            
            {
                this$0 = WishProduct.this;
                sortAsNumbers = flag;
                super();
            }
        });
        Iterator iterator1 = arraylist.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            WishProductSize wishproductsize1 = (WishProductSize)iterator1.next();
            if (!variationSizes.contains(wishproductsize1.size))
            {
                variationSizes.add(wishproductsize1.size);
            }
        } while (true);
        if (variationColors != null)
        {
            Collections.sort(variationColors);
        }
        if (hiddenVariationColors != null)
        {
            Collections.sort(hiddenVariationColors);
        }
_L43:
        if (jsonobject.has("credit") && !jsonobject.isNull("credit"))
        {
            credit = new WishCredit(jsonobject.getJSONObject("credit"));
            return;
        }
        return;
_L48:
        j++;
          goto _L49
        jsonexception;
        i = -1;
          goto _L50
    }

    private boolean areSizesAllNumeric(ArrayList arraylist)
    {
        for (arraylist = arraylist.iterator(); arraylist.hasNext();)
        {
            if (((WishProductSize)arraylist.next()).orderingValue == null)
            {
                return false;
            }
        }

        return true;
    }

    public static int getMaxComments()
    {
        return 2;
    }

    public static long getSerialversionuid()
    {
        return 0x1017369b55ff798eL;
    }

    private void handleProductRecommendationNotification(Bundle bundle)
    {
        if (bundle.getString("ProductId").equals(productId))
        {
            if (alreadyRecommended == null)
            {
                alreadyRecommended = new ArrayList();
            }
            HashMap hashmap = new HashMap();
            for (Iterator iterator = alreadyRecommended.iterator(); iterator.hasNext(); hashmap.put((String)iterator.next(), Boolean.valueOf(true))) { }
            Object obj = bundle.getStringArrayList("RecommendedFbIds");
            if (obj != null)
            {
                obj = ((ArrayList) (obj)).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    String s1 = (String)((Iterator) (obj)).next();
                    if (!hashmap.containsKey(s1))
                    {
                        alreadyRecommended.add(s1);
                        hashmap.put(s1, Boolean.valueOf(true));
                    }
                } while (true);
            }
            if (alreadyRecommendedGoogleIds == null)
            {
                alreadyRecommendedGoogleIds = new ArrayList();
            }
            hashmap = new HashMap();
            for (Iterator iterator1 = alreadyRecommendedGoogleIds.iterator(); iterator1.hasNext(); hashmap.put((String)iterator1.next(), Boolean.valueOf(true))) { }
            bundle = bundle.getStringArrayList("RecommendedGoogleIds");
            if (bundle != null)
            {
                bundle = bundle.iterator();
                do
                {
                    if (!bundle.hasNext())
                    {
                        break;
                    }
                    String s = (String)bundle.next();
                    if (!hashmap.containsKey(s))
                    {
                        alreadyRecommendedGoogleIds.add(s);
                        hashmap.put(s, Boolean.valueOf(true));
                    }
                } while (true);
            }
        }
    }

    private void handleProductUnwishNotification(Bundle bundle)
    {
        if (bundle.getString("ProductId").equals(productId))
        {
            isAlreadyWishing = false;
            if (recommendFbUsers != null)
            {
                recommendFbUsers.clear();
            }
        }
    }

    private void handleProductWishNotification(Bundle bundle)
    {
        if (bundle.getString("ProductId").equals(productId))
        {
            isAlreadyWishing = true;
        }
    }

    public boolean canShowAddToCartModal()
    {
        return hasSelectableOptions();
    }

    public WishAddToCartOffer getAddToCartOffer()
    {
        return addToCartOffer;
    }

    public String getAddToCartOfferId()
    {
        if (addToCartOffer != null && !addToCartOffer.isExpired())
        {
            return addToCartOffer.getOfferId();
        } else
        {
            return null;
        }
    }

    public ArrayList getAlreadyRecommended()
    {
        return alreadyRecommended;
    }

    public ArrayList getAlreadyRecommendedGoogleIds()
    {
        return alreadyRecommendedGoogleIds;
    }

    public double getAspectRatio()
    {
        return aspectRatio;
    }

    public String getBrand()
    {
        return brand;
    }

    public String getBuyLink()
    {
        return buyLink;
    }

    public int getCommentCount()
    {
        return commentCount;
    }

    public String getCommerceDefaultVariationId()
    {
        return defaultCommerceVariationId;
    }

    public String getCommerceProductId()
    {
        return commerceProductId;
    }

    public WishLocalizedCurrencyValue getCommerceValue()
    {
        return commerceValue;
    }

    public WishCredit getCredit()
    {
        return credit;
    }

    public String getCreditId()
    {
        return creditId;
    }

    public String getDefaultCommerceVariationId()
    {
        return defaultCommerceVariationId;
    }

    public String getDescription()
    {
        return description;
    }

    public String getExternalUrl()
    {
        return externalUrl;
    }

    public ArrayList getExtraPhotos()
    {
        return extraPhotos;
    }

    public String getFbCommentUrl()
    {
        return fbCommentUrl;
    }

    public WishLocalizedCurrencyValue getHiddenValue()
    {
        if (hiddenValue.getValue() > 0.0D)
        {
            return hiddenValue;
        } else
        {
            return value;
        }
    }

    public ArrayList getHiddenVariationColors()
    {
        return hiddenVariationColors;
    }

    public ArrayList getHiddenVariationSizes()
    {
        return hiddenVariationSizes;
    }

    public WishHourlyDeal getHourlyDeal()
    {
        return hourlyDeal;
    }

    public WishImage getImage()
    {
        return getImage(false);
    }

    public WishImage getImage(boolean flag)
    {
        if (flag && originalImage != null)
        {
            return originalImage;
        } else
        {
            return image;
        }
    }

    public int getMaxShippingTime()
    {
        return maxShippingTime;
    }

    public String getMerchantId()
    {
        return merchantId;
    }

    public String getMerchantName()
    {
        return merchantName;
    }

    public double getMerchantRating()
    {
        return merchantRating;
    }

    public int getMerchantRatingCount()
    {
        return merchantRatingCount;
    }

    public String getMerchantUniqueName()
    {
        return merchantUniqueName;
    }

    public String getMerchantUserId()
    {
        return merchantUserId;
    }

    public int getMinShippingTime()
    {
        return minShippingTime;
    }

    public String getName()
    {
        return name;
    }

    public int getNumBought()
    {
        return numBought;
    }

    public int getNumWishes()
    {
        return numWishes;
    }

    public String getOriginalBuyLink()
    {
        if (originalBuyLink != null)
        {
            return originalBuyLink;
        } else
        {
            return getBuyLink();
        }
    }

    public double getOriginalImageHeight()
    {
        return originalImageHeight;
    }

    public double getOriginalImageWidth()
    {
        return originalImageWidth;
    }

    public String getProductId()
    {
        return productId;
    }

    public double getProductRating()
    {
        return averageRating;
    }

    public int getProductRatingCount()
    {
        return ratingCount;
    }

    public WishPromoBannerSpec getPromoBannerSpec()
    {
        return promoBannerSpec;
    }

    public WishRatingSizeSummary getRatingSizeSummary()
    {
        return ratingSizeSummary;
    }

    public String getRawName()
    {
        return rawName;
    }

    public double getRebatePercentage()
    {
        return rebatePercentage;
    }

    public WishLocalizedCurrencyValue getRebateValue()
    {
        return rebateValue;
    }

    public ArrayList getRecommendFbUsers()
    {
        return recommendFbUsers;
    }

    public ArrayList getRelatedProducts()
    {
        return relatedProducts;
    }

    public String getReturnPolicyLongString()
    {
        return returnPolicyLongString;
    }

    public String getReturnPolicyShortString()
    {
        return returnPolicyShortString;
    }

    public String getShareMessage()
    {
        return shareMessage;
    }

    public String getShareSubject()
    {
        return shareSubject;
    }

    public String getShippingCountriesString()
    {
        return shippingCountriesString;
    }

    public String getShippingOfferText()
    {
        return shippingOfferText;
    }

    public String getShippingOfferTitle()
    {
        return shippingOfferTitle;
    }

    public WishLocalizedCurrencyValue getShippingPrice()
    {
        return shippingPrice;
    }

    public String getShippingPriceCountry()
    {
        return shippingPriceCountry;
    }

    public String getShippingTimeString()
    {
        return shippingTimeString;
    }

    public String getShipsFrom()
    {
        return shipsFrom;
    }

    public WishLocalizedCurrencyValue getSignupGiftPrice()
    {
        return signupGiftPrice;
    }

    public String getSizingChartUrl()
    {
        return sizingChartUrl;
    }

    public ArrayList getStructuredDescriptions()
    {
        return structuredDescriptions;
    }

    public ArrayList getTags()
    {
        return tags;
    }

    public String getTaxText()
    {
        return taxText;
    }

    public ArrayList getTopRatings()
    {
        return topRatings;
    }

    public int getTotalInventory()
    {
        return totalInventory;
    }

    public String getUrgencyText()
    {
        return urgencyText;
    }

    public WishUser getUserCreator()
    {
        return userCreator;
    }

    public WishLocalizedCurrencyValue getValue()
    {
        return value;
    }

    public ArrayList getVariationColors()
    {
        return variationColors;
    }

    public String getVariationId(String s, String s1)
    {
        for (Iterator iterator = variationIdMapping.entrySet().iterator(); iterator.hasNext();)
        {
            Object obj = (java.util.Map.Entry)iterator.next();
            String s2 = (String)((java.util.Map.Entry) (obj)).getKey();
            obj = (WishProductVariation)((java.util.Map.Entry) (obj)).getValue();
            if ((((WishProductVariation) (obj)).color == null && s1 == null || ((WishProductVariation) (obj)).color != null && s1 != null && ((WishProductVariation) (obj)).color.equals(s1)) && (((WishProductVariation) (obj)).size == null && s == null || ((WishProductVariation) (obj)).size != null && s != null && ((WishProductVariation) (obj)).size.equals(s)))
            {
                return s2;
            }
        }

        return null;
    }

    public WishProductExtraImage getVariationImage(String s)
    {
        return (WishProductExtraImage)variationImageMapping.get(s);
    }

    public WishLocalizedCurrencyValue getVariationPrice(String s)
    {
        return (WishLocalizedCurrencyValue)variationPriceMapping.get(s);
    }

    public WishLocalizedCurrencyValue getVariationPriceBeforeDiscounts(String s)
    {
        return (WishLocalizedCurrencyValue)variationPriceBeforeDiscountsMapping.get(s);
    }

    public WishLocalizedCurrencyValue getVariationRetailPrice(String s)
    {
        return (WishLocalizedCurrencyValue)variationRetailPriceMapping.get(s);
    }

    public ArrayList getVariationSizes()
    {
        return variationSizes;
    }

    public String getWishGuaranteeText()
    {
        return wishGuaranteeText;
    }

    public String getYoutubeVideoId()
    {
        return youtubeVideoId;
    }

    public boolean hasMultipleVariations()
    {
        return variationStockMapping.size() > 1 && (variationSizes.size() > 0 || variationColors.size() > 0);
    }

    public boolean hasSelectableOptions()
    {
        return hasMultipleVariations();
    }

    public boolean isAlreadyWishing()
    {
        return isAlreadyWishing;
    }

    public boolean isC2C()
    {
        return isC2C;
    }

    public boolean isCommerceProduct()
    {
        return isCommerceProduct;
    }

    public boolean isConcept()
    {
        return isConcept;
    }

    public boolean isInStock()
    {
        return inStock;
    }

    public boolean isInStock(String s)
    {
        s = (Boolean)variationStockMapping.get(s);
        return s != null && s.booleanValue();
    }

    public boolean isNewWithTags()
    {
        return isNewWithTags;
    }

    public boolean isPreview()
    {
        return isPreview;
    }

    public void onNotificationReceived(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType notificationtype, Bundle bundle)
    {
        if (notificationtype == com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.Wish)
        {
            handleProductWishNotification(bundle);
        } else
        {
            if (notificationtype == com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.Unwish)
            {
                handleProductUnwishNotification(bundle);
                return;
            }
            if (notificationtype == com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.ProductRecommendation)
            {
                handleProductRecommendationNotification(bundle);
                return;
            }
        }
    }

    public void setCommentCount(int i)
    {
        commentCount = i;
    }

    public void setCredit(WishCredit wishcredit)
    {
        credit = wishcredit;
    }

    public void setCreditId(String s)
    {
        creditId = s;
    }

    public void setRecommendFbUsers(ArrayList arraylist)
    {
        recommendFbUsers = arraylist;
    }

    public void setWishing()
    {
        isAlreadyWishing = true;
    }
}
