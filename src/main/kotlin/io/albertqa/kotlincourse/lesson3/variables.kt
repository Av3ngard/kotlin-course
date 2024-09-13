package io.albertqa.io.albertqa.kotlincourse.lesson3

//Название мероприятия
val name: String = "Hackathon Survival"

//Дата проведения
var date: String = "2024.04.09"

//Место проведения
val place: String = "Moscow"

//Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.
var equipment: String = "100000"
var catering: String = "1000"
var costs: String = "10000"

//Количество участников
var member: Int = 0
    get() = field
    private set(value) {field = value}

//Длительность хакатона
val duration: Long = 8*60*60

//Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.
private lateinit var contacts: String

//Текущее состояние хакатона (статус)
var status: String = "Не начат"

//Список спонсоров
val sponsor: String = "KFC"

//Бюджет мероприятия
var total_budget: Int = 1200000

//Текущий уровень доступа к интернету
var connection_status: String = "Connected"

//Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.
private var transport: String = "Info"

//Количество команд
var commands_quantity: Int = 5

//Перечень задач
var tasks: String = "Tasks"

//План эвакуации
val evacuation_plan: String = "Plan"

//Список доступного оборудования
var connection_status: String = "Connected"

//Список свободного оборудования
var connection_status: String = "Connected"

//График питания участников (зависит от поставщика питания, определяемого за неделю до начала)
var connection_status: String = "Connected"

//План мероприятий на случай сбоев
var connection_status: String = "Connected"

//Список экспертов и жюри
var connection_status: String = "Connected"

//Методы и процедуры для сбора отзывов от участников и гостей, включая анонимные опросы и интервью.
var connection_status: String = "Connected"

//Политика конфиденциальности
var connection_status: String = "Connected"

//Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.
var connection_status: String = "Connected"

//Текущая температура в помещении
var connection_status: String = "Connected"

//Мониторинг и анализ производительности сетевого оборудования и интернет-соединения.
var connection_status: String = "Connected"

//Уровень освещения
var connection_status: String = "Connected"

//Лог событий мероприятия
var connection_status: String = "Connected"

//Доступность медицинской помощи
var connection_status: String = "Connected"

//Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций.
var connection_status: String = "Connected"

//Регистрационный номер мероприятия
val regnumber: Int = 123

//Максимально допустимый уровень шума в помещении хакатона.
var connection_status: String = "Connected"

//Индикатор превышения уровня шума в помещениях
var connection_status: String = "Connected"

//Формат мероприятия (зависит от геополитической обстановки)
var connection_status: String = "Connected"

//Количество свободных мест для отдыха (например, кресел или диванов), сеттер валидирует, чтобы количество не было меньше нуля.
var connection_status: String = "Connected"

//План взаимодействия с прессой
var connection_status: String = "Connected"

//Детальная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок.
var connection_status: String = "Connected"

//Статус получения всех необходимых разрешений
var connection_status: String = "Connected"

//Указывает, открыт ли доступ к эксклюзивным ресурсам (например, специальному оборудованию)
var connection_status: String = "Connected"

//Список партнеров мероприятия
var connection_status: String = "Connected"

//Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.
var connection_status: String = "Connected"

//План распределения призов
var connection_status: String = "Connected"

//Контактная информация экстренных служб, медицинского персонала и других важных служб, недоступная участникам.
var connection_status: String = "Connected"

//Особые условия для участников с ограниченными возможностями
var connection_status: String = "Connected"

//Общее настроение участников (определяется опросами)
var connection_status: String = "Connected"

//Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия.
var connection_status: String = "Connected"

//Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия.
var connection_status: String = "Connected"

//Максимальное количество людей, которое может вместить место проведения.
val max_people: Int = 500

//Стандартное количество часов, отведенное каждой команде для работы над проектом.
val default_hours: Long = 1*60*60

//Текущая температура в помещении
var current_temperature: Int = 21
