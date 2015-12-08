.class public Lcom/crashlytics/android/answers/AddToCartEvent;
.super Lcom/crashlytics/android/answers/PredefinedEvent;
.source "AddToCartEvent.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/crashlytics/android/answers/PredefinedEvent",
        "<",
        "Lcom/crashlytics/android/answers/AddToCartEvent;",
        ">;"
    }
.end annotation


# static fields
.field static final CURRENCY_ATTRIBUTE:Ljava/lang/String; = "currency"

.field static final ITEM_ID_ATTRIBUTE:Ljava/lang/String; = "itemId"

.field static final ITEM_NAME_ATTRIBUTE:Ljava/lang/String; = "itemName"

.field static final ITEM_PRICE_ATTRIBUTE:Ljava/lang/String; = "itemPrice"

.field static final ITEM_TYPE_ATTRIBUTE:Ljava/lang/String; = "itemType"

.field static final MICRO_CONSTANT:Ljava/math/BigDecimal;

.field static final TYPE:Ljava/lang/String; = "addToCart"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 13
    const-wide/32 v0, 0xf4240

    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v0

    sput-object v0, Lcom/crashlytics/android/answers/AddToCartEvent;->MICRO_CONSTANT:Ljava/math/BigDecimal;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Lcom/crashlytics/android/answers/PredefinedEvent;-><init>()V

    return-void
.end method


# virtual methods
.method getPredefinedType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 86
    const-string v0, "addToCart"

    return-object v0
.end method

.method priceToMicros(Ljava/math/BigDecimal;)J
    .locals 2
    .param p1, "decimal"    # Ljava/math/BigDecimal;

    .prologue
    .line 81
    sget-object v0, Lcom/crashlytics/android/answers/AddToCartEvent;->MICRO_CONSTANT:Ljava/math/BigDecimal;

    invoke-virtual {v0, p1}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public putCurrency(Ljava/util/Currency;)Lcom/crashlytics/android/answers/AddToCartEvent;
    .locals 3
    .param p1, "currency"    # Ljava/util/Currency;

    .prologue
    .line 74
    iget-object v0, p0, Lcom/crashlytics/android/answers/AddToCartEvent;->validator:Lcom/crashlytics/android/answers/AnswersEventValidator;

    const-string v1, "currency"

    invoke-virtual {v0, p1, v1}, Lcom/crashlytics/android/answers/AnswersEventValidator;->isNull(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 75
    iget-object v0, p0, Lcom/crashlytics/android/answers/AddToCartEvent;->predefinedAttributes:Lcom/crashlytics/android/answers/AnswersAttributes;

    const-string v1, "currency"

    invoke-virtual {p1}, Ljava/util/Currency;->getCurrencyCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/crashlytics/android/answers/AnswersAttributes;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    :cond_0
    return-object p0
.end method

.method public putItemId(Ljava/lang/String;)Lcom/crashlytics/android/answers/AddToCartEvent;
    .locals 2
    .param p1, "itemId"    # Ljava/lang/String;

    .prologue
    .line 28
    iget-object v0, p0, Lcom/crashlytics/android/answers/AddToCartEvent;->predefinedAttributes:Lcom/crashlytics/android/answers/AnswersAttributes;

    const-string v1, "itemId"

    invoke-virtual {v0, v1, p1}, Lcom/crashlytics/android/answers/AnswersAttributes;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    return-object p0
.end method

.method public putItemName(Ljava/lang/String;)Lcom/crashlytics/android/answers/AddToCartEvent;
    .locals 2
    .param p1, "itemName"    # Ljava/lang/String;

    .prologue
    .line 39
    iget-object v0, p0, Lcom/crashlytics/android/answers/AddToCartEvent;->predefinedAttributes:Lcom/crashlytics/android/answers/AnswersAttributes;

    const-string v1, "itemName"

    invoke-virtual {v0, v1, p1}, Lcom/crashlytics/android/answers/AnswersAttributes;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    return-object p0
.end method

.method public putItemPrice(Ljava/math/BigDecimal;)Lcom/crashlytics/android/answers/AddToCartEvent;
    .locals 4
    .param p1, "itemPrice"    # Ljava/math/BigDecimal;

    .prologue
    .line 61
    iget-object v0, p0, Lcom/crashlytics/android/answers/AddToCartEvent;->validator:Lcom/crashlytics/android/answers/AnswersEventValidator;

    const-string v1, "itemPrice"

    invoke-virtual {v0, p1, v1}, Lcom/crashlytics/android/answers/AnswersEventValidator;->isNull(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 62
    iget-object v0, p0, Lcom/crashlytics/android/answers/AddToCartEvent;->predefinedAttributes:Lcom/crashlytics/android/answers/AnswersAttributes;

    const-string v1, "itemPrice"

    invoke-virtual {p0, p1}, Lcom/crashlytics/android/answers/AddToCartEvent;->priceToMicros(Ljava/math/BigDecimal;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/crashlytics/android/answers/AnswersAttributes;->put(Ljava/lang/String;Ljava/lang/Number;)V

    .line 64
    :cond_0
    return-object p0
.end method

.method public putItemType(Ljava/lang/String;)Lcom/crashlytics/android/answers/AddToCartEvent;
    .locals 2
    .param p1, "itemType"    # Ljava/lang/String;

    .prologue
    .line 50
    iget-object v0, p0, Lcom/crashlytics/android/answers/AddToCartEvent;->predefinedAttributes:Lcom/crashlytics/android/answers/AnswersAttributes;

    const-string v1, "itemType"

    invoke-virtual {v0, v1, p1}, Lcom/crashlytics/android/answers/AnswersAttributes;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    return-object p0
.end method
