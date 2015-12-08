.class public Lcom/mixpanel/android/viewcrawler/EditProtocol$Edit;
.super Ljava/lang/Object;
.source "EditProtocol.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/viewcrawler/EditProtocol;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Edit"
.end annotation


# instance fields
.field public final imageUrls:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final visitor:Lcom/mixpanel/android/viewcrawler/ViewVisitor;


# direct methods
.method private constructor <init>(Lcom/mixpanel/android/viewcrawler/ViewVisitor;Ljava/util/List;)V
    .locals 0
    .param p1, "aVisitor"    # Lcom/mixpanel/android/viewcrawler/ViewVisitor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mixpanel/android/viewcrawler/ViewVisitor;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 57
    .local p2, "someUrls":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Lcom/mixpanel/android/viewcrawler/EditProtocol$Edit;->visitor:Lcom/mixpanel/android/viewcrawler/ViewVisitor;

    .line 59
    iput-object p2, p0, Lcom/mixpanel/android/viewcrawler/EditProtocol$Edit;->imageUrls:Ljava/util/List;

    .line 60
    return-void
.end method

.method synthetic constructor <init>(Lcom/mixpanel/android/viewcrawler/ViewVisitor;Ljava/util/List;Lcom/mixpanel/android/viewcrawler/EditProtocol$Edit;)V
    .locals 0

    .prologue
    .line 57
    invoke-direct {p0, p1, p2}, Lcom/mixpanel/android/viewcrawler/EditProtocol$Edit;-><init>(Lcom/mixpanel/android/viewcrawler/ViewVisitor;Ljava/util/List;)V

    return-void
.end method
