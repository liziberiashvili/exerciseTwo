
პროექტი შექმნილია mvn არქიტექტურული სტილის გამოყენებით,სამუშაო არეალია test/java/org.example.com პაკეტი.
Description:
1)ამოცანა 1 - car კლასი:
შექმნილია Car კლასი brand,model,year ცვლადებითა და  generateCarInfo() და printCarInfo() მეთოდებით.ცვლადებისთვის მნიშვნელობის მისანიჭებლად გამოყენებულია Faker ბიბლიოთეკა მეთოდებით faker.vehicle().make(),
faker.vehicle().model() და faker.number().numberBetween().მეთოდების გამოძახება ხდება ამავე კლასის მეინ მეთოდში.

2)ამოცანა 2 - User კლასი და Constructor Overloading:
შექმნილია sUer კლასი name და email ცვლადებითა და ორი კონსტრუქტორით,რომლიდანაც ერთი იღებს მხოლოდ name პარამეტრს,ხოლო მეორე name და email პარამეტრებს.ამ კლასში შექმნილია ასევე printUserInfo() გადატვირთული ორი მეთოდი.მეთოდების გამოძახებისათვის შექმნილია UserAction კლასი სადაც გამოყენებულია Faker ბიბლიოთეკა ცვლადებისათვის მნიშვნელობის მისანიჭებლად.

3)ამოცანა 3 – Student კლასი და getter/setter მეთოდები:
შექმნილია Student კლასი private name,age და grade ცვლადებით,Student კონსტრუქტორი და getter და setter.შექმნილია ასევე StudentAction კლასი,სადაც main მეთოდში ხდება Faker ბიბლიოთეკის გამოყენება და getter და setter მეთოდების გამოყენებით ცვლადებისათვის მნიშვნელობების მინიჭება.

4)ამოცანა 4 – Calculator კლასი და მეთოდის გადატვირთვა:
შექმნილია Calculator კლასი და ორი გადატვირთული multiply() მეთოდი.მეთოდების გამოსაძახებლად შექმნილია CalculatorActions კლასი სადაც faker.random().nextInt() მეთოდით ხდება ცვლადების მნიშვნელობების დაგენერირება.

5)ამოცანა 5 – Book კლასი და toString():
შექმნილია Book კლასი protected title,author და pages ცვლადებით,Book კონსტრუქტორითა და toString() მეთოდით რომელიც აბრუნებს წიგნის არასწრულ აღწერას.ასევე,შექმნილია BookInfo კლასი,რომელიც მემკვიდრეობით იღებს Book-კლასის ცვლადებს,კონსტრუქტორსა და მეთოდებს და რომელსაც გააჩნია თავისი protected genre ცვლადი,BookInfo კონსტრუქტორი და overrided toString() მეთოდი,რომელიც აბრუნებს წიგნის სრულ აღწერას.მეთოდის გამოსაძახებლად შექმნილია BookAction კლასი,სადაც Faker ბიბლიოთეკის გამოყენებით ხდება ცვლადებზე მნიშვნელობების მინიჭება.

6)ამოცანა 6 – BankAccount კლასი:
შექმნილია BankAccount კლასი fullName და balance ცვლადებითა და generateUserName(), generateUserBalance(), checkUserBalance() მეთოდები,რომელთა გამოძახება ხდება ამავე კლასის main მეთოდში.

7)ამოცანა 7 – Product კლასი და ფასდაკლება:
შექმნილია Product კლასი productPrice და discount ცვლადებით,generateProductPrice() მეთოდი,რომელიც Faker ბიბლიოთეკის გამოყენებით აგენერირებს int ფასს,რომელსაც პარსავს double-ში და საბოლოოდ აბრუნებს double price-ს.generateDiscountPercentage() მეთოდი,რომელიც Faker ბიბლიოთეკის გამოყენების ირჩევს რენდომ რიცხვს 1-100ჩათვლით და აბრუნებს მას და applyDiscount() მეთოდი,რომელიც ითვლის ფასდაკლებულ ფასს და აკლებს პროდუქტის ღირებულებას.მეთოდების გამოძახება ხდება ამავე კლასის main მეთოდში.

8)ამოცანა 8 – Address კლასი და User-ში კომპოზიცია:
*შენიშვნა: User კლასის ნაცვლად შექმნილია Person კლასი.
შექმნილია Address კლასი protected country,city და streetAdress ცვლადებით,Address კონსტრუქტორითა და generateAddress() მეთოდით,ასევე შექმნილია Person კლასი,რომელიც არის Address-ის მემკვიდრე და გააჩნია თავისი protected address და buildingNumber ცვლადები,Person კონსტრუქტორი,რომელშიც ხდება მშბოლის generateAdress() მეთოდის ცვლადში ინიცირება, generateBuildingNumber() და generateFullAddress() მეთოდები.მეთოდების გამოსაძახებლად კი შექმნილია AddressAction კლასი.

9)ამოცანა 9 – Student.equals() მეთოდი:
*შენიშვნა: Student კლასის ნაცვლად შექმნილია Teacher კლასი.
შექმნილია Teacher კლასი,ორი teacherId და teacherNames არაილისტითა და teacherInfo ჰეშმეფით.generateTeacherID() და generateTeacherNames() მეთოდებში Faker ბიბლიოთეკის გამოყენებით ვაგენერირებ მონაცემებს და ვამატებ ამ მონაცემებს ლისტებში.
checkTeacherIDItems() მეთოდში კი for ციკლისა და if/else გამოყენებით გადავუარე სათითაოდ id item-ებს და დუპლიკაციის არ არსებობის შემთხვევაში ვამატებ მონაცემებს teacherInfo მეფში.მეთოდების გამოძახება ხდება ამავე კლასის main მეთოდში.
