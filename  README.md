# InventoryMS Backend

Phần Backend của dự án quản lý kho InventoryMS, xây dựng bằng Java Spring Boot.

## Công nghệ sử dụng

- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL (hoặc MySQL tùy cấu hình)
- Maven để quản lý dependencies

## Cài đặt và chạy dự án

1. Cài đặt Java 17 và Maven trên máy bạn.
2. Clone repository:

```bash
git clone https://github.com/khanhlee11/inventoryms-backend.git
cd inventoryms-backend
Cấu hình database trong file application.properties hoặc application.yml (ở thư mục src/main/resources).

Ví dụ (PostgreSQL):

properties
Copy
Edit
spring.datasource.url=jdbc:postgresql://localhost:5432/inventoryms
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password
spring.jpa.hibernate.ddl-auto=update
Chạy ứng dụng:

bash
mvn spring-boot:run
Ứng dụng sẽ chạy trên cổng mặc định 5050 (hoặc theo cấu hình).

API
Bạn có thể truy cập API tại: http://localhost:5050/api

Tài liệu tham khảo
Spring Boot Documentation

Spring Data JPA Documentation

Lưu ý
File cấu hình chứa thông tin nhạy cảm (như mật khẩu database) nên được giữ an toàn và không đẩy lên GitHub.