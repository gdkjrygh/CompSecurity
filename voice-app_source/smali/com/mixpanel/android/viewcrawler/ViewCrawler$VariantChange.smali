.class Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantChange;
.super Ljava/lang/Object;
.source "ViewCrawler.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/viewcrawler/ViewCrawler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "VariantChange"
.end annotation


# instance fields
.field public final activityName:Ljava/lang/String;

.field public final change:Lorg/json/JSONObject;

.field public final variantId:Landroid/util/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Pair",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lorg/json/JSONObject;Landroid/util/Pair;)V
    .locals 0
    .param p1, "anActivityName"    # Ljava/lang/String;
    .param p2, "someChange"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            "Landroid/util/Pair",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1004
    .local p3, "aVariantId":Landroid/util/Pair;, "Landroid/util/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1005
    iput-object p1, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantChange;->activityName:Ljava/lang/String;

    .line 1006
    iput-object p2, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantChange;->change:Lorg/json/JSONObject;

    .line 1007
    iput-object p3, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantChange;->variantId:Landroid/util/Pair;

    .line 1008
    return-void
.end method
