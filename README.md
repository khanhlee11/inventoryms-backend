# 📦 InventoryMS Backend

**InventoryMS Backend** là phần backend của hệ thống quản lý kho Inventory Management System, được xây dựng bằng Java Spring Boot. Hệ thống hỗ trợ quản lý sản phẩm, tồn kho và người dùng, cung cấp API cho frontend tương tác.

---

## 🛠️ Công Nghệ Sử Dụng

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL 8+
- Maven để quản lý dependencies

---

🧩 Tính Năng Ứng Dụng
| Tính năng                   | Mô tả                                                                          |
| --------------------------- | ------------------------------------------------------------------------------ |
| **Quản lý sản phẩm**        | Tạo, sửa, xóa và xem chi tiết sản phẩm (mã, tên, loại, giá, v.v.).             |
| **Quản lý tồn kho**         | Theo dõi số lượng sản phẩm, nhập kho, xuất kho theo thời gian thực.            |
| **Lịch sử giao dịch**       | Lưu lại lịch sử xuất/nhập kho của từng sản phẩm để dễ dàng tra cứu.            |
| **Quản lý người dùng**      | Tạo tài khoản, phân quyền, cập nhật thông tin cá nhân và đổi mật khẩu.         |
| **Phân quyền chi tiết**     | Bảo vệ các API dựa trên vai trò (Admin, Nhân viên) bằng JWT + Spring Security. |
| **Thống kê đơn giản**       | (Optional) Hiển thị tổng số sản phẩm, số lượng còn lại, hoặc các biểu đồ nhỏ.  |
| **Cấu hình CORS & bảo mật** | Cấu hình CORS để frontend truy cập được backend + bảo vệ endpoint quan trọng.  |

🖼️ Giao diện Ứng Dụng (Frontend)
💡 Hình ảnh minh họa từ frontend ReactJS kết nối đến backend Spring Boot

![image](https://github.com/user-attachments/assets/da0632c4-5cfe-48f1-8fe1-89e70d6db513)
![image](https://github.com/user-attachments/assets/2549e191-e791-413f-b526-6a9c06fbcf31)




## ⚙️ Cài Đặt và Chạy Ứng Dụng

### 1. Cài Đặt Java và Maven

Đảm bảo bạn đã cài đặt Java 17 và Maven trên máy của mình.

### 2. Clone Repository

```bash
git clone https://github.com/khanhlee11/inventoryms-backend.git
cd inventoryms-backend
3. Cấu Hình Database
Cấu hình database trong file application.properties hoặc application.yml (ở thư mục src/main/resources).

Ví dụ (MySQL):

properties
spring.datasource.url=jdbc:mysql://localhost:3306/inventoryms
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password
spring.jpa.hibernate.ddl-auto=update

⚠️ Lưu ý: Không commit thông tin nhạy cảm như mật khẩu vào GitHub. Hãy sử dụng biến môi trường hoặc các công cụ quản lý cấu hình an toàn.

4. Chạy Ứng Dụng
mvn spring-boot:run
Ứng dụng sẽ chạy trên cổng mặc định 5050 (hoặc theo cấu hình).

📡 API Endpoint
Base URL: http://localhost:5050/api

⚠️ Đảm bảo rằng frontend được cấu hình để gọi đúng endpoint này.

📚 Tài Liệu Tham Khảo
Spring Boot Documentation
Spring Data JPA Documentation
Spring Security + JWT

📌 Liên kết liên quan
🔗 [Frontend - InventoryMS (ReactJS)](https://github.com/khanhlee11/inventoryms-frontend)


