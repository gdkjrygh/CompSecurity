.class public abstract Lcom/google/android/gms/common/images/zza;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/common/images/zza$zza;,
        Lcom/google/android/gms/common/images/zza$zzc;,
        Lcom/google/android/gms/common/images/zza$zzb;
    }
.end annotation


# instance fields
.field final zzZc:Lcom/google/android/gms/common/images/zza$zza;

.field protected zzZd:I

.field protected zzZe:I

.field protected zzZf:Z

.field protected zzZg:Lcom/google/android/gms/common/images/ImageManager$OnImageLoadedListener;

.field private zzZh:Z

.field private zzZi:Z

.field private zzZj:Z

.field protected zzZk:I


# direct methods
.method public constructor <init>(Landroid/net/Uri;I)V
    .locals 2

    const/4 v1, 0x1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v0, p0, Lcom/google/android/gms/common/images/zza;->zzZd:I

    iput v0, p0, Lcom/google/android/gms/common/images/zza;->zzZe:I

    iput-boolean v0, p0, Lcom/google/android/gms/common/images/zza;->zzZf:Z

    iput-boolean v1, p0, Lcom/google/android/gms/common/images/zza;->zzZh:Z

    iput-boolean v0, p0, Lcom/google/android/gms/common/images/zza;->zzZi:Z

    iput-boolean v1, p0, Lcom/google/android/gms/common/images/zza;->zzZj:Z

    new-instance v0, Lcom/google/android/gms/common/images/zza$zza;

    invoke-direct {v0, p1}, Lcom/google/android/gms/common/images/zza$zza;-><init>(Landroid/net/Uri;)V

    iput-object v0, p0, Lcom/google/android/gms/common/images/zza;->zzZc:Lcom/google/android/gms/common/images/zza$zza;

    iput p2, p0, Lcom/google/android/gms/common/images/zza;->zzZe:I

    return-void
.end method

.method private zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzkj;I)Landroid/graphics/drawable/Drawable;
    .locals 4

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget v0, p0, Lcom/google/android/gms/common/images/zza;->zzZk:I

    if-lez v0, :cond_2

    new-instance v2, Lcom/google/android/gms/internal/zzkj$zza;

    iget v0, p0, Lcom/google/android/gms/common/images/zza;->zzZk:I

    invoke-direct {v2, p3, v0}, Lcom/google/android/gms/internal/zzkj$zza;-><init>(II)V

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/zzkj;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_1

    invoke-virtual {v1, p3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget v3, p0, Lcom/google/android/gms/common/images/zza;->zzZk:I

    and-int/lit8 v3, v3, 0x1

    if-eqz v3, :cond_0

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/common/images/zza;->zza(Landroid/content/res/Resources;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :cond_0
    invoke-virtual {p2, v2, v0}, Lcom/google/android/gms/internal/zzkj;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    return-object v0

    :cond_2
    invoke-virtual {v1, p3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method protected zza(Landroid/content/res/Resources;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 1

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/zzkh;->zza(Landroid/content/res/Resources;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method protected zza(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)Lcom/google/android/gms/internal/zzkg;
    .locals 1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    instance-of v0, p1, Lcom/google/android/gms/internal/zzkg;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/zzkg;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzkg;->zznp()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    :cond_0
    :goto_0
    new-instance v0, Lcom/google/android/gms/internal/zzkg;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/zzkg;-><init>(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-object v0

    :cond_1
    move-object p1, v0

    goto :goto_0
.end method

.method zza(Landroid/content/Context;Landroid/graphics/Bitmap;Z)V
    .locals 4

    const/4 v3, 0x1

    invoke-static {p2}, Lcom/google/android/gms/common/internal/zzb;->zzq(Ljava/lang/Object;)V

    iget v0, p0, Lcom/google/android/gms/common/images/zza;->zzZk:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    invoke-static {p2}, Lcom/google/android/gms/internal/zzkh;->zza(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p2

    :cond_0
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1, p2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    iget-object v1, p0, Lcom/google/android/gms/common/images/zza;->zzZg:Lcom/google/android/gms/common/images/ImageManager$OnImageLoadedListener;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/common/images/zza;->zzZg:Lcom/google/android/gms/common/images/ImageManager$OnImageLoadedListener;

    iget-object v2, p0, Lcom/google/android/gms/common/images/zza;->zzZc:Lcom/google/android/gms/common/images/zza$zza;

    iget-object v2, v2, Lcom/google/android/gms/common/images/zza$zza;->uri:Landroid/net/Uri;

    invoke-interface {v1, v2, v0, v3}, Lcom/google/android/gms/common/images/ImageManager$OnImageLoadedListener;->onImageLoaded(Landroid/net/Uri;Landroid/graphics/drawable/Drawable;Z)V

    :cond_1
    const/4 v1, 0x0

    invoke-virtual {p0, v0, p3, v1, v3}, Lcom/google/android/gms/common/images/zza;->zza(Landroid/graphics/drawable/Drawable;ZZZ)V

    return-void
.end method

.method zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzkj;)V
    .locals 3

    const/4 v2, 0x0

    iget-boolean v0, p0, Lcom/google/android/gms/common/images/zza;->zzZj:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iget v1, p0, Lcom/google/android/gms/common/images/zza;->zzZd:I

    if-eqz v1, :cond_0

    iget v0, p0, Lcom/google/android/gms/common/images/zza;->zzZd:I

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/common/images/zza;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzkj;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p0, v0, v2, v1, v2}, Lcom/google/android/gms/common/images/zza;->zza(Landroid/graphics/drawable/Drawable;ZZZ)V

    :cond_1
    return-void
.end method

.method zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzkj;Z)V
    .locals 4

    const/4 v3, 0x0

    const/4 v0, 0x0

    iget v1, p0, Lcom/google/android/gms/common/images/zza;->zzZe:I

    if-eqz v1, :cond_0

    iget v0, p0, Lcom/google/android/gms/common/images/zza;->zzZe:I

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/common/images/zza;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzkj;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/common/images/zza;->zzZg:Lcom/google/android/gms/common/images/ImageManager$OnImageLoadedListener;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/common/images/zza;->zzZg:Lcom/google/android/gms/common/images/ImageManager$OnImageLoadedListener;

    iget-object v2, p0, Lcom/google/android/gms/common/images/zza;->zzZc:Lcom/google/android/gms/common/images/zza$zza;

    iget-object v2, v2, Lcom/google/android/gms/common/images/zza$zza;->uri:Landroid/net/Uri;

    invoke-interface {v1, v2, v0, v3}, Lcom/google/android/gms/common/images/ImageManager$OnImageLoadedListener;->onImageLoaded(Landroid/net/Uri;Landroid/graphics/drawable/Drawable;Z)V

    :cond_1
    invoke-virtual {p0, v0, p3, v3, v3}, Lcom/google/android/gms/common/images/zza;->zza(Landroid/graphics/drawable/Drawable;ZZZ)V

    return-void
.end method

.method protected abstract zza(Landroid/graphics/drawable/Drawable;ZZZ)V
.end method

.method protected zzb(ZZ)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/common/images/zza;->zzZh:Z

    if-eqz v0, :cond_1

    if-nez p2, :cond_1

    if-eqz p1, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/common/images/zza;->zzZi:Z

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zzbm(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/common/images/zza;->zzZe:I

    return-void
.end method
