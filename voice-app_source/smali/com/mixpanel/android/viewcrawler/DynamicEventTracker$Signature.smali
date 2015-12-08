.class Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$Signature;
.super Ljava/lang/Object;
.source "DynamicEventTracker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Signature"
.end annotation


# instance fields
.field private final mHashCode:I


# direct methods
.method public constructor <init>(Landroid/view/View;Ljava/lang/String;)V
    .locals 2
    .param p1, "view"    # Landroid/view/View;
    .param p2, "eventName"    # Ljava/lang/String;

    .prologue
    .line 141
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 142
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    iput v0, p0, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$Signature;->mHashCode:I

    .line 143
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    const/4 v0, 0x0

    .line 147
    instance-of v1, p1, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$Signature;

    if-eqz v1, :cond_0

    .line 148
    iget v1, p0, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$Signature;->mHashCode:I

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    .line 151
    :cond_0
    return v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 156
    iget v0, p0, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker$Signature;->mHashCode:I

    return v0
.end method
