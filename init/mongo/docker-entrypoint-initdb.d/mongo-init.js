print('START');

db = db.getSiblingDB('product-service');

db.createuser(
    {
        user: 'mongoadmin',
        password: 'password',
        roles: [{ role: 'readwrite', db: 'product-service'}],
    }
);

db.createCollection('user');

print('END');
