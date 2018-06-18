FROM php:5.6.32-apache

RUN requirements="libcurl3-dev wget vim ssmtp sox" \
        && apt-get update && apt-get install -y --no-install-recommends $requirements 
		
RUN docker-php-ext-configure pdo \
	&& docker-php-ext-install pdo \
	&& docker-php-ext-configure pdo_mysql \
	&& docker-php-ext-install pdo_mysql \
	&& docker-php-ext-configure mysqli \
	&& docker-php-ext-install mysqli \
	&& docker-php-ext-configure mysql \
	&& docker-php-ext-install mysql

ENV TZ=America/New_York
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

COPY 000-default.conf /etc/apache2/sites-available/