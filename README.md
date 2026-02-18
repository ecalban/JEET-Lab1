JEET.Lab1 - JavaSE GUI & Database Management
Bu proje, Łukasz Laszko tarafından hazırlanan "Lab.1: Building a JavaSE application with GUI for database management" kılavuzu kapsamında geliştirilmiştir. Projenin temel amacı; Java SE, Maven, H2DB ve JUnit teknolojilerini kullanarak profesyonel bir yazılım geliştirme döngüsü (Git dahil) deneyimlemektir.

🎓 Akademik Kapsam
Laboratuvar çalışması şu temel yetkinlikleri hedeflemektedir:


Geliştirme Ortamı: NetBeans IDE üzerinde Java 17 (LTS) yapılandırması.


Veritabanı Entegrasyonu: H2DB kullanarak "Embedded" modda veritabanı yönetimi.


Veri Erişimi: UserDAO sınıfı üzerinden CRUD işlemlerinin gerçekleştirilmesi.


Test Odaklı Geliştirme: JUnit 5 kullanarak DAO katmanının doğrulanması.

🛠 Teknik Mimari

Maven: Bağımlılık yönetimi (pom.xml).


H2 Database: Uygulama başlatıldığında DatabaseInitializer aracılığıyla tabloların oluşturulması.


Swing GUI: UserApp sınıfı ile görsel bir kullanıcı arayüzü sunulması.


Git: Proje yaşam döngüsünün add, commit ve push adımlarıyla yönetilmesi.

🚀 Çalıştırma Talimatları

Veritabanı Başlatma: Proje ana sınıfı çalıştırıldığında DatabaseInitializer.initialize() metodu otomatik olarak çağrılır.


Kullanıcı Ekleme: GUI üzerindeki form aracılığıyla isim ve e-posta bilgileri kaydedilebilir.


Testlerin Koşturulması: UserDAOTest sınıfı üzerinden birim testleri uygulanabilir.

📚 Atıf
Bu çalışma, Łukasz Laszko'nun JavaEE Technologies - Lab.1 ders notları ve öğrenci rehberi temel alınarak tamamlanmıştır.